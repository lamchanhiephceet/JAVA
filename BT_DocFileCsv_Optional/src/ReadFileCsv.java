import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileCsv {
    public static void main(String[] args) {
        ReadFileCsv readFileCsv = new ReadFileCsv();
        readFileCsv.readFileCsv("D:\\JAVA\\Sample\\demo.csv");

    }
    public void readFileCsv(String filePath) {
        try {
            File file = new File(filePath);
            if(!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] country = line.split(",");
                System.out.println("Country [code= " + country[4] + " , name = " + country[5] + "]");
            }
            br.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
