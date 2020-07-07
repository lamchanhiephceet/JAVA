import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class StudentIO {
    private static final String Student_file_name = "student.txt";

    public void write(List<Student> studentList) throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(Student_file_name));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Loi ghi file" + e);
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }
    public List<Student> read() {
        List<Student> studentList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(Student_file_name));
            ois = new ObjectInputStream(fis);
            studentList = (List<Student>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println("Loi doc file " +e);
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return studentList;
    }
    private void closeStream(InputStream is) {
        if(is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static void closeStream(OutputStream os) {
        if(os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
