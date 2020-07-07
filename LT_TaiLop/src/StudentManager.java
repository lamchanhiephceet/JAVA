import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    public static Scanner scanner = new Scanner(System.in);
    private List<Student> studentList = new ArrayList<>();
    private StudentIO studentIO = new StudentIO();

    public void add() {
        int id;
        id = (studentList.size() > 0) ? (studentList.size() + 1) : 1;
        System.out.println("student id = " + id);
        String name = inputName();
        String address = inputAddress();
        Student student = new Student(id, name, address);
        studentList.add(student);
        try {
            studentIO.write(studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void edit(int id) {
        boolean isExisted = false;
        int size = studentList.size();
        for (int i=0;i<size;i++) {
            if(studentList.get(i).getId() == id) {
                isExisted = true;
                studentList.get(i).setName(inputName());
                studentList.get(i).setAddress(inputAddress());
                break;
            }
        }
        if(!isExisted) {
            System.out.printf("id = %d not existed. \n", id);
        } else {
            try {
                studentIO.write(studentList);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void delete(int id) {
        Student student = null;
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            if (studentList.get(i).getId() == id) {
                student = studentList.get(i);
                break;
            }
        }
        if (student != null) {
            studentList.remove(student);
            try {
                studentIO.write(studentList);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }

    }
    public void show() {
        studentList = studentIO.read();
        for(Student stock : studentList) {
            System.out.println("id student:   " + stock.getId());
            System.out.println("Name student: " + stock.getName());
            System.out.println("Address:     " + stock.getAddress());
        }
    }
    public int inputId() {
        System.out.print("Nhap id sinh vien: ");
        while(true) {
            try {
                int id = Integer.parseInt((scanner.nextLine()));
                return id;
            } catch(NumberFormatException e) {
                System.out.print("id khong hop le, nhap lai");
            }
        }
    }
    private String inputName() {
        System.out.print("Nhap ten sinh vien: ");
        return scanner.nextLine();
    }
    private String inputAddress() {
        System.out.print("Nhap dia chi: ");
        return scanner.nextLine();
    }
}
