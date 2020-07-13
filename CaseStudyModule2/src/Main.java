
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();

        int choose;
        do {
            showmenu();
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {

                case 1:
                    System.out.println("Nhap thong tin danh muc");
                    manager.importCategory();
                    Manager.saveFileCategory();
                    break;
                case 2:
                    System.out.println("Nhap thong tin san pham");
                    Manager.inputProduct();

                    Manager.saveFileProduct();
                    break;
                case 3:
                    System.out.println("In ra danh sach cac san pham da ban ");
                    manager.Sell();
                    break;
                case 4:
                    System.out.println("In ra danh sach san pham con ton kho");
                    manager.Inventory();
                    break;
                case 5:
                    System.out.println("In ra danh sach san pham da qua han su dung");
                    manager.Rest();
                    break;
                case 6:
                    System.out.println("In ra cac san pham sap het han su dung");
                    manager.AlmostEndDate();
                    break;
                case 7:
                    System.out.println("TIM KIEM");
                    manager.SearchProduct();
                    break;
                case 8:
                    Manager.editProduct();

                    break;
                case 9:
                    Manager.deleteProduct();

                    break;
                case 10:
                    Manager.sort();

                    break;
                case 11:
                    System.out.println("Da doc file hoan tat");

                    Manager.readFileProduct();
                    manager.readFileCategory();

                    break;
                case 12:
                    System.out.println("PP");
                    break;

                default:
                    System.out.println("Vui long nhap lai");

            }
        } while (choose != 0);

    }

    static void showmenu() {
        System.out.println("1 : Nhap thong tin danh muc");
        System.out.println("2 : Nhap thong tin san pham");
        System.out.println("3 : In danh sach cac san pham da ban");
        System.out.println("4 : In danh sach cac san pham con ton lai trong kho");
        System.out.println("5 : In danh sach cac san pham da qua han su dung");
        System.out.println("6 : In ra danh sach cac san pham sap het han su dung");
        System.out.println("7 : Tim kiem san pham");
        System.out.println("8 : Sua thong tin san pham bang id");
        System.out.println("9 : Xoa thong tin san pham bang id");
        System.out.println("10 : Sap xep san pham theo ten");
        System.out.println("11: Doc du lieu tu file");
        System.out.println("12: Thoat");
        System.out.println("Chooose: ");
    }
}
