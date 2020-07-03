import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class StockManager {
    public static Scanner scanner = new Scanner(System.in);
    private List<Stock> stockList = new ArrayList<>();
    private StockIO stockIO = new StockIO();

public void add() {
    int id;
    id = (stockList.size() > 0) ? (stockList.size() + 1) : 1;
    System.out.println("stock id = " + id);
//    int id = inputId();
    String name = inputName();
    String producer = inputProducer();
    double price = inputPrice();
    int quantity = inputQuantity();
    Stock stock = new Stock(id,name,producer,price,quantity);
    stockList.add(stock);
    try {
        stockIO.write(stockList);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    public void edit(int id) {
        boolean isExisted = false;
        int size = stockList.size();
        for (int i = 0; i < size; i++) {
            if (stockList.get(i).getId() == id) {
                isExisted = true;
                stockList.get(i).setName(inputName());
                stockList.get(i).setPrice(inputPrice());
                stockList.get(i).setProducer(inputProducer());
                stockList.get(i).setQuantity(inputQuantity());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
            try {
                stockIO.write(stockList);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void delete(int id) {
        Stock stock = null;
        int size = stockList.size();
        for (int i = 0; i < size; i++) {
            if (stockList.get(i).getId() == id) {
                stock = stockList.get(i);
                break;
            }
        }
        if (stock != null) {
            stockList.remove(stock);
            try {
                stockIO.write(stockList);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
    }

    public void show() {
    stockList = stockIO.read();
    for(Stock stock : stockList) {
        System.out.println("id product:   " + stock.getId());
        System.out.println("Name product: " + stock.getName());
        System.out.println("Producer:     " + stock.getProducer());
        System.out.println("Price:        " + stock.getPrice());
        System.out.println("Quantity:     " + stock.getQuantity());
    }
}
public int inputId() {
    System.out.print("Nhap id san pham: ");
    while(true) {
        try {
            int id = Integer.parseInt((scanner.nextLine()));
            return id;
        } catch(NumberFormatException e) {
            System.out.print("id khong hop le, nhap lai");
        }
    }
}
private String inputName() {
    System.out.print("Nhap ten san pham: ");
    return scanner.nextLine();
}
    private String inputProducer() {
        System.out.print("Nhap ten nha san xuat: ");
        return scanner.nextLine();
    }
    public long inputPrice() {
        System.out.print("Nhap gia san pham: ");
        while(true) {
            try {
                long price = Integer.parseInt((scanner.nextLine()));
                return price;
            } catch(NumberFormatException e) {
                System.out.print("gia khong hop le, nhap lai");
            }
        }
    }
    public int inputQuantity() {
        System.out.print("Nhap so luong san pham: ");
        while(true) {
            try {
                int quantity = Integer.parseInt((scanner.nextLine()));
                return quantity;
            } catch(NumberFormatException e) {
                System.out.print("so luong khong hop le, nhap lai");
            }
        }
    }
    public List<Stock> getStockList() {
    return stockList;
    }
    public void setStockList(List<Stock> stockList) {
    this.stockList = stockList;
    }
}