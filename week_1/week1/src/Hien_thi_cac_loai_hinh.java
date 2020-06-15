import java.util.Scanner;
public class Hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the triangle bottom-left");
        System.out.println("3. Draw the triangle top-left");
        System.out.println("4. Draw the isosceles triangle");
        System.out.println("0. Exit");

        System.out.println("Enter your choice: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j <=7; j++)
                    System.out.print("#");
                    System.out.println("");
                }
                break;
            case 2:
                for(int i=1; i<=5; i++) {
                    for (int j = 1; j <= i; j++)
                        System.out.print("#");
                    System.out.println("");
                }
                break;
            case 3:
                for(int i=5;i>=1;i--) {
                    for (int j = 1; j <= i; j++)
                        System.out.print("#");
                    System.out.println("");
                }
                break;
            case 4:
                for (int i=1; i<8; i += 2)
                {
                    for (int k=0; k < (4 - i / 2); k++)
                    {
                        System.out.print(" ");
                    }
                    for (int j=0; j<i; j++)
                    {
                        System.out.print("#");
                    }
                    System.out.println("");
                }
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
        while(choice != 0) {
        }
    }
}
