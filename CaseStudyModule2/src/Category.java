
import java.io.Serializable;
import java.util.Scanner;

public class Category implements Serializable {
    String IdCate, NameCate;

    public Category() {
    }

    public Category(String IdCate, String NameCate) {
        this.IdCate = IdCate;
        this.NameCate = NameCate;
    }

    public String getIdCate() {
        return IdCate;
    }

    public void setIdCate(String IdCate) {
        this.IdCate = IdCate;
    }

    public String getNameCate() {
        return NameCate;
    }

    public void setNameCate(String NameCate) {
        this.NameCate = NameCate;
    }

    @Override
    public String toString() {
        return "Category{" + "IdCate=" + IdCate + ", NameCate=" + NameCate + '}';
    }

    public void display() {
        System.out.println(toString());
    }

    public void inputCategory() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Moi ban nhap ma danh muc : ");
        IdCate = scan.nextLine();
        System.out.println("Moi ban nhap ten danh muc : ");
        NameCate = scan.nextLine();
    }

    String formatLine() {
        return IdCate + "," + NameCate + "\n";
    }

    void getLine(String line) {
        line = line.trim();
        String[] data = line.split(",");
        if (data.length < 2) {
            System.out.println("Data error");
            return;
        }
        this.IdCate = data[0];
        this.NameCate = data[1];
    }
}
