import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\Source\\mydata.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Stock sArr[] = (Stock[]) ois.readObject();
            for(Stock s : sArr) {
                System.out.println(s.toString());
            }
            fis.close();
            ois.close();
        } catch (Exception e) {
            System.out.println("Loi doc file: " +e);
        }
    }
}
