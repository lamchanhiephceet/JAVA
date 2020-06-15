import java.util.Scanner;
public class QuadraticEquation {
    double a, b, c, delta;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        delta = b * b - 4 * a * c;
        return delta;
    }
    public double getRoot1() {
        return (-b + Math.sqrt ( delta))/2 * a;
    }

    public double getRoot2() {
        return (-b - Math.sqrt ( delta))/(2 * a);
    }
    public double getRoot3() {
        return -b/(2*a);
    }
    public void display() {
            System.out.println("QuadraticEquation: " + a + "X2+"  + b +  "X+"  + c + "  = 0");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap so b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap so c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadratic = new QuadraticEquation(a,b,c);
        System.out.println("Your QuadraticEquation \n" );
        quadratic.display();
        double delta = quadratic.getDiscriminant();
        if(delta>0){
            System.out.println("The equation has two roots:\n"  + quadratic.getRoot1() + "\n"  + quadratic.getRoot2());
        }
        if( delta == 0){
            System.out.println("The equation has one roots:\n"  + quadratic.getRoot3());
        }
        else{
            System.out.println("The equation has no roots");
        }

    }
}