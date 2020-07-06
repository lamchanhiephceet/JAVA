package controller;

import model.Book;
import model.BookReaderManagement;
import model.Reader;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class DataController {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    private Scanner scanner;

    public void openFileToWrite(String fileName) {
        try {
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openFileToRead(String fileName) {
        try {
            File file = new File(fileName);
            if (!file.exists()) { // nếu file chưa tồn tại
                file.createNewFile(); // tạo mới file này
            }
            scanner = new Scanner(Paths.get(fileName), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeFileAfterRead(String fileName) {
        try {
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeBookToFile(Book book, String fileName) {
        openFileToWrite(fileName);
        printWriter.println(book.getBookID() + "|" + book.getBookName() + "|"
                + book.getAuthor() + "|" + book.getSpecialization() + "|"
                + book.getPublishYear() + "|" + book.getQuantity());
        closeFileAfterWrite(fileName);
    }

    public void writeReaderToFile(Reader reader, String fileName) {
        openFileToWrite(fileName);
        printWriter.println(reader.getReaderID() + "|" + reader.getFullName() + "|"
                + reader.getAddress() + "|" + reader.getPhoneNumber());
        closeFileAfterWrite(fileName);
    }

    public void writeBRMToFile(BookReaderManagement brm, String fileName) {
        openFileToWrite(fileName);
        printWriter.println(brm.getReader().getReaderID() + "|" + brm.getBook().getBookID()
                + "|" + brm.getNumOfBorrow() + "|" + brm.getState());
        closeFileAfterWrite(fileName);
    }

    public void closeFileAfterWrite(String fileName) {
        try {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Reader> readReadersFromFile(String fileName) {
        openFileToRead(fileName);
        ArrayList<Reader> readers = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            Reader reader = createReaderFromData(data);
            readers.add(reader);
        }

        closeFileAfterRead(fileName);
        return readers;
    }

    public Reader createReaderFromData(String data) {
        String[] datas = data.split("\\|");
        //printWriter.println(reader.getReaderID() + "|" + reader.getFullName() + "|"
        //                + reader.getAddress() + "|" + reader.getPhoneNumber());
        //Reader(int readerID, String fullName, String address, String phoneNumber)
        Reader reader = new Reader(Integer.parseInt(datas[0]), datas[1], datas[2], datas[3]);
        return reader;
    }

    public ArrayList<Book> readBooksFromFile(String fileName) {
        openFileToRead(fileName);
        ArrayList<Book> books = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            Book book = createBookFromData(data);
            books.add(book);
        }
        closeFileAfterRead(fileName);
        return books;
    }

    public Book createBookFromData(String data) {
        String[] datas = data.split("\\|");
        //println(book.getBookID() + "|" + book.getBookName() + "|"
        //                + book.getAuthor() + "|" + book.getSpecialization() + "|"
        //                + book.getPublishYear() + book.getQuantity());

        //Book(int bookID, String bookName, String author,
        //                String specialization, int publishYear, int quantity)
        Book book = new Book(Integer.parseInt(datas[0]), datas[1], datas[2], datas[3],
                Integer.parseInt(datas[4]), Integer.parseInt(datas[5]));

        return book;
    }

    public ArrayList<BookReaderManagement> readBRMsFromFile(String fileName) {
        var books = readBooksFromFile("BOOK.DAT");
        var readers = readReadersFromFile("READER.DAT");

        openFileToRead(fileName);
        ArrayList<BookReaderManagement> brms = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            BookReaderManagement reader = createBRMFromData(data, readers, books);
            brms.add(reader);
        }

        closeFileAfterRead(fileName);
        return brms;
    }

    public BookReaderManagement createBRMFromData(String data, ArrayList<Reader> readers,
                                                  ArrayList<Book> books) {
        String[] datas = data.split("\\|");
        //brm.getReader().getReaderID() + "|" + brm.getBook().getBookID()
        //                + "|" + brm.getNumOfBorrow() + "|" + brm.getState()

        //Book book, Reader reader,
        //                         int numOfBorrow, String state, int totalBorrowed
        BookReaderManagement brm =
                new BookReaderManagement(getBook(books, Integer.parseInt(datas[1])),
                        getReader(readers, Integer.parseInt(datas[0])),
                        Integer.parseInt(datas[2]), datas[3], 0);
        return brm;
    }

    private static Book getBook(ArrayList<Book> books, int bookID) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookID() == bookID) {
                return books.get(i);
            }
        }
        return null;
    }

    /**
     * phương thức này trả về một đối tượng Reader trong danh sách với id cho trước
     * @param readers
     * @param readerID
     * @return
     */
    private static Reader getReader(ArrayList<Reader> readers, int readerID) {

        for (int i = 0; i < readers.size(); i++) {
            if (readers.get(i).getReaderID() == readerID) {
                return readers.get(i);
            }
        }
        return null;
    }

    public void updateBRMFile(ArrayList<BookReaderManagement> list, String fileName) {
        // xóa bỏ file cũ
        File file = new File(fileName);
        if (file.exists()) {
            file.delete(); // xoa no đi
        }
        // ghi mới file này:
        openFileToWrite(fileName);
        for (var brm : list) {
            printWriter.println(brm.getReader().getReaderID() + "|" + brm.getBook().getBookID()
                    + "|" + brm.getNumOfBorrow() + "|" + brm.getState());
        }
        closeFileAfterWrite(fileName);
    }

    /*
    Ghi thông tin sách vào file
    Ghi thông tin bạn đọc vào file
    Ghi thông tin BRM vào file

    Đọc thông tin sách từ file  --> chuyển thành đối tượng sách
                                --> thêm vào danh sách các sách
                                --> trả về danh sách các sách.

    Đọc thông tin bạn đọc từ file--> chuyển thành đối tượng bạn đọc
                                 --> thêm vào danh sách các bạn đọc
                                 --> trả về danh sách các bạn đọc.

    Đọc thông tin BRM từ file.  --> chuyển thành đối tượng BRM
                                --> thêm vào danh sách các BRM
                                --> trả về danh sách các BRM.
    Quy ước ghi thông tin:
        - Mỗi đối tượng ghi trên một dòng
        - Giữa các thuộc tính cách nhau bởi dấu |
    Ví dụ: lớp Reader(readerID, fullName, address, phoneNumber)
    thì thông tin trong file sẽ là: readerID|fullName|address|phoneNumber
     */
}
