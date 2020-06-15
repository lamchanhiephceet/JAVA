import java.util.Scanner;
public class Tinh_BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Can nang cua ban(kg): ");
        weight = scanner.nextDouble();

        System.out.print("Chieu cao cua ban(m): ");
        height = scanner.nextDouble();

        bmi = weight/Math.pow(height,2);
        System.out.printf("%-20s%s", "bmi", "Dien giai\n");
        if(bmi<18)
            System.out.printf("%-20.2f%s", bmi, "Thieu can");
        else if(bmi<25.0)
            System.out.printf("%-20.2f%s", bmi, "Binh thuong");
        else if(bmi<30)
            System.out.printf("%-20.2f%s", bmi, "Thua can");
        else
            System.out.printf("%-20.2f%s", bmi, "Beo phi");
    }

}
