import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputExample {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:\\Source\\mydata.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            Stock s[] = new Stock[]{
                    new Stock(1, "Motherboard", "Gigabyte", 5000000, 5),
                    new Stock(2, "CPU", "Intel", 3000000, 10),
                    new Stock(3, "Display", "Samsung", 2500000, 15),
                    new Stock(4, "SSD", "Samsung", 2000000, 10),
                    new Stock (5,"Power Unit","Coolmaster",2000000,9),
                    new Stock (6,"RAM","Kingston",100000,14)

            };
            oos.writeObject(s);
            fos.close();
            oos.close();
            System.out.println("Da ghi xong file");
        } catch (IOException e) {
            System.out.println("Loi ghi file "+ e);
        }
    }
}
