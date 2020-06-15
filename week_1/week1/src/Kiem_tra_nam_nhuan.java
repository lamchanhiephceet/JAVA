import java.util.Scanner;
public class Kiem_tra_nam_nhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhap so nam:");
        year = scanner.nextInt();

        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf("%d la nam nhuan duong", year);
        } else {
            System.out.printf("%d khong la nam nhuan duong", year);
        }
    }
}
