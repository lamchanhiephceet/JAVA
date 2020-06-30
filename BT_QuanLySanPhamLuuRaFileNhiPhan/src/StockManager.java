//import java.io.IOException;
//import java.util.List;
//import java.util.Scanner;
//
//public class StockManager {
//    public static Scanner scanner = new Scanner(System.in);
//    private List<Stock> stockList;
//    private StockIO stockIO;
//
//public void add() {
////    int id;
////    id = (stockList.size() > 0) ? (stockList.size() + 1) : 1;
////    System.out.println("stock id = " + id);
//    int id = inputId();
//    String name = inputName();
//    String producer = inputProducer();
//    double price = inputPrice();
//    int quantity = inputQuantity();
//    Stock stock = new Stock(id,name,producer,price,quantity);
//    stockList.add(stock);
//    try {
//        stockIO.write(stockList);
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//}
//public void show() {
//    for(Stock stock : stockList) {
//        System.out.println(stock.getId());
//        System.out.println(stock.getName());
//        System.out.println(stock.getProducer());
//        System.out.println(stock.getPrice());
//        System.out.println(stock.getQuantity());
//    }
//}
//public int inputId() {
//    System.out.print("Nhap id san pham: ");
//    while(true) {
//        try {
//            int id = Integer.parseInt((scanner.nextLine()));
//            return id;
//        } catch(NumberFormatException e) {
//            System.out.print("id khong hop le, nhap lai");
//        }
//    }
//}
//private String inputName() {
//    System.out.print("Nhap ten san pham: ");
//    return scanner.nextLine();
//}
//    private String inputProducer() {
//        System.out.print("Nhap ten nha san xuat: ");
//        return scanner.nextLine();
//    }
//    public double inputPrice() {
//        System.out.print("Nhap gia san pham: ");
//        while(true) {
//            try {
//                double price = Double.parseDouble((scanner.nextLine()));
//                return price;
//            } catch(NumberFormatException e) {
//                System.out.print("gia khong hop le, nhap lai");
//            }
//        }
//    }
//    public int inputQuantity() {
//        System.out.print("Nhap so luong san pham: ");
//        while(true) {
//            try {
//                int quantity = Integer.parseInt((scanner.nextLine()));
//                return quantity;
//            } catch(NumberFormatException e) {
//                System.out.print("so luong khong hop le, nhap lai");
//            }
//        }
//    }
//    public List<Stock> getStockList() {
//    return stockList;
//    }
//    public void setStockList(List<Stock> stockList) {
//    this.stockList = stockList;
//    }
//}