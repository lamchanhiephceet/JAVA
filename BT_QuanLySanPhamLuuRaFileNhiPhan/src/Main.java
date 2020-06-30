//import java.util.Scanner;
//
//public class Main {
//    public static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        String choose = null;
//        boolean exit = false;
//        StockManager stockManager = new StockManager();
//
//        // show menu
//        showMenu();
//        while (true) {
//            choose = scanner.nextLine();
//            switch (choose) {
//                case "1":
//                    stockManager.add();
//                    break;
//                case "2":
//                    stockManager.show();
//                    break;
//                case "0":
//                    System.out.println("exited!");
//                    exit = true;
//                    break;
//                default:
//                    System.out.println("invalid! please choose action in below menu:");
//                    break;
//            }
//            if (exit) {
//                break;
//            }
//            // show menu
//            showMenu();
//        }
//    }
//
//
//    public static void showMenu() {
//        System.out.println("-----------menu------------");
//        System.out.println("1. Add product.");
//        System.out.println("2. Show student.");
//        System.out.println("0. exit.");
//        System.out.println("---------------------------");
//        System.out.print("Please choose: ");
//    }
//}
