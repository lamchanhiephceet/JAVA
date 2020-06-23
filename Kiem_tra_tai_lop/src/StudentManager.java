//
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//    public class StudentManager {
//
//        List<Student> studentList = new ArrayList<>();
//
//        public void add() {
//            int id = (studentList.size() > 0) ? (studentList.size() + 1) : 1;
//            System.out.println("student id = " + id);
//            String name = inputName();
//            int age = inputAge();
//            Student student = new Student(id, name, age);
//            studentList.add(student);
//            studentDao.write(studentList);
//        }
//        public void edit(int id) {
//            boolean isExisted = false;
//            int size = studentList.size();
//            for (int i = 0; i < size; i++) {
//                if (studentList.get(i).getId() == id) {
//                    isExisted = true;
//                    studentList.get(i).setName(inputName());
//                    studentList.get(i).setAge(inputAge());
//                    break;
//                }
//            }
//            if (!isExisted) {
//                System.out.printf("id = %d not existed.\n", id);
//            } else {
//                studentDao.write(studentList);
//            }
//        }
//
//        public void delete(int id) {
//            Student student = null;
//            int size = studentList.size();
//            for (int i = 0; i < size; i++) {
//                if (studentList.get(i).getId() == id) {
//                    student = studentList.get(i);
//                    break;
//                }
//            }
//            if (student != null) {
//                studentList.remove(student);
//                studentDao.write(studentList);
//            } else {
//                System.out.printf("id = %d not existed.\n", id);
//            }
//        }
//
//        public void show() {
//            for (Student student : studentList) {
//                System.out.format("%5d | ", student.getId());
//                System.out.format("%20s | ", student.getName());
//                System.out.format("%5d | ", student.getAge());
//            }
//        }
//
//        public int inputId() {
//            System.out.print("Input student id: ");
//            while (true) {
//                try {
//                    int id = Integer.parseInt((scanner.nextLine()));
//                    return id;
//                } catch (NumberFormatException ex) {
//                    System.out.print("invalid! Input student id again: ");
//                }
//            }
//        }
//        private String inputName() {
//            System.out.print("Input student name: ");
//            return scanner.nextLine();
//        }
//
//
//        private int inputAge() {
//            System.out.print("Input student age: ");
//            while (true) {
//                try {
//                    int age = Byte.parseByte((scanner.nextLine()));
//                    if (age < 0 && age > 100) {
//                        throw new NumberFormatException();
//                    }
//                    return age;
//                } catch (NumberFormatException ex) {
//                    System.out.print("invalid! Input student id again: ");
//                }
//            }
//        }
//
//        // getter && setter
//        public List<Student> getStudentList() {
//            return studentList;
//        }
//
//        public void setStudentList(List<Student> studentList) {
//            this.studentList = studentList;
//        }
//
//        private class ArrayList implements List<Student> {
//        }
//    }
//}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StudentManager {
    private List<Student> studentList = new ArrayList<>();
    public static void main(String[] args) {
        StudentManager classC05 = new StudentManager();
        while (true){
            classC05.showWelcomeScreen();
        }
    }
    public  void showWelcomeScreen() {
        System.out.println("--------------------------------------");
        System.out.println("Select function:");
        System.out.println("--------------------------------------");
        System.out.println("1. Show student list.");
        System.out.println("2. Add new student.");
        System.out.println("3. Remove student.");
        System.out.println("0. Exit.");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                showStudentList();
                break;
            case 2:
                addNewStudent();
                break;
            case 3:
                removeStudent();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Invalid choice.");
        }
    }
    public void showRemoveStudentScreen() {
        System.out.println("--------------------------------------");
        System.out.println("Select student to remove:");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(i + ". Name: " + studentList.get(i).getName() + ". Age: " + studentList.get(i).getAge());
        }
    }
    public void removeStudent(){
        showRemoveStudentScreen();
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        Student result = studentList.remove(index);
        System.out.println("Remove student successfully: Name: " + result.getName() + ". Age: " + result.getAge());
    }
    public void addNewStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student's name:");
        String name = scanner.nextLine();
        System.out.println("Please enter student's age:");
        int age = scanner.nextInt();
        Student student = new Student(name, age);
        studentList.add(student);
        System.out.printf("Add new student successfully: Name: %s. Age: %d \n", student.getName(),student.getAge());
    }
    public void showStudentList() {
        for (Student student : studentList){
            System.out.println("Name: " + student.getName() + ". Age: " + student.getAge());
        }
    }
    public Student add(Student student) {
        studentList.add(student);
        return student;
    }
}