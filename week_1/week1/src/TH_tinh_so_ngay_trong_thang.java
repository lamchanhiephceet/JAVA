import java.util.Scanner;
public class TH_tinh_so_ngay_trong_thang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chon thang ban muon tinh ngay: ");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.print("Thang 2 co 28 hoac 29 ngay.");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print(" Thang' " + month + " 'co 31 ngay.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("Thang' " + month + " 'co 30 ngay.");
                break;
            default:
                System.out.print("So thang khong hop le !");
                break;
        }
    }
    }
