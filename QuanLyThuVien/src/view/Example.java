package view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try {
            File newFile = new File("NEW.DAT");
            newFile.deleteOnExit();
//            File originalFile = new File("HELLO.DAT");
//            originalFile.renameTo(newFile);

//            if(!newFile.exists()){
//                newFile.createNewFile();
//            }
//
//            Scanner scanner = new Scanner(originalFile);
//            FileWriter fileWriter = new FileWriter(newFile);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            PrintWriter printWriter = new PrintWriter(bufferedWriter);
//
//            while(scanner.hasNextLine())
//            {
//                String data = scanner.nextLine();
//                printWriter.println(data);
//            }
//            printWriter.close();
//            bufferedWriter.close();
//            fileWriter.close();
//            // change name
//            scanner.close();
//            if(newFile.exists()){
//                newFile.renameTo(new File("HELLO.DAT"));
//            }
//
//            originalFile.delete();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
