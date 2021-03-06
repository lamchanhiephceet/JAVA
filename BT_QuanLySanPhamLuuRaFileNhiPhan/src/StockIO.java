import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class StockIO {
    private static final String Stock_file_name = "stock.txt";

    public void write(List<Stock> stockList) throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(Stock_file_name));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(stockList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Loi ghi file "+ e);
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }
    public List<Stock> read() {
        List<Stock> stockList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(Stock_file_name));
            ois = new ObjectInputStream(fis);
            stockList = (List<Stock>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Loi doc file: " +e);
        } finally {
            closeStream(fis);
            closeStream(ois);
        }

        return stockList;

    }
    private void closeStream(InputStream is) {
        if(is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

