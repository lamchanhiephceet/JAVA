import java.util.Scanner;
public class Tim_uoc_chung_lon_nhat {
    public static void main(String[] args) {
        int a,b;
        Scanner nhap= new Scanner(System.in);
        System.out.println("Nhap so a: ");
        a = nhap.nextInt();

        System.out.println("Nhap so b: ");
        b = nhap.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);

        if(a==0 || b==0)
            System.out.println("Khong co uoc chung lon nhat");
         while(a!=b){
             if(a>b)
                 a = a-b;
             else
                 b = b-a;
         }
        System.out.println("Uoc chung lon nhat la: "+a);
    }
}
