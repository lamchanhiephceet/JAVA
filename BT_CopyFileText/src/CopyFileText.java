import java.io.*;
public class CopyFileText {
    public static void main(String[] args) {
        try {
            CopyFileText resource = new CopyFileText();
            System.out.println("File truoc khi copy");
            String line = resource.readFileText("D:/JAVA/Sample/file.txt");
            File target = new File("D:/JAVA/Sample/file.txt");
            FileWriter fw = new FileWriter(target);
            fw.write(line);
            fw.close();
            System.out.println("Sau day la file text da duoc copy: ");
            resource.readFileText("D:/JAVA/Sample/file.txt");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public String readFileText(String filePath) throws Exception {
        File file = new File(filePath);

        if(!file.exists()) {
            throw new FileNotFoundException();
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = "";
        String s = "";

        while((line = br.readLine()) != null) {
            s += (line + " ");
        }
        System.out.println(s);
        br.close();
        return s;
    }
}
