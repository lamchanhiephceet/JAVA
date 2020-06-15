
import java.util.Scanner;
public class Dem_ky_tu_trong_chuoi {
    public static void countChart(String str, char form) {
        int index = 0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == form) {
                index++;
            }
        }
        System.out.println("So ky tu xuat hien trong chuoi la: ");
        System.out.println(index);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "Hello World ! \nNgay hom nay cua ban the nao ?";
        System.out.println(str);
        System.out.println("Nhap ky tu can dem: ");
        char enter =input.next().charAt(0);
        countChart(str,enter );
    }
}
