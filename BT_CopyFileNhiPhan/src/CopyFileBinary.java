import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class CopyFileBinary {
    private static Object buffer;

    public static void main(String[] args) {
        File source = new File("D:/Source/test.txt");
        File destination = new File("D:/Source/Java/filecopy.txt");
        try {
            copyFile(source, destination);
            System.out.println("Copy Completed");
        } catch (IOException e) {
            System.out.println("Problem occurs while copying files");
            e.printStackTrace();
        }
    }

    public static void copyFile(File source, File destination) throws IOException {
            InputStream inputStream = new FileInputStream(source);
            OutputStream outputStream = new FileOutputStream(destination);

            byte[] buffer = new byte[1024];
            int lineLength;
            while ((lineLength = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, lineLength);
            }


    }
}
