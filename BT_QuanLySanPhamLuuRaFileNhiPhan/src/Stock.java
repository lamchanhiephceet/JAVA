//import java.io.Serializable;
//public class Stock implements Serializable {
//    private int id;
//    private String name;
//    private String producer;
//    private double price;
//    private int quantity;
//
//    public Stock(int id, String name, String producer, double price, int quantity) {
//        this.id = id;
//        this.name = name;
//        this.producer = producer;
//        this.price = price;
//        this.quantity = quantity;
//    }
//    @Override
//    public String toString() {
//        return id + "-" + name + "-" + producer + "-" + price + "-" +quantity;
//    }
//
//}
import java.io.Serializable;

public class Stock implements Serializable {
    private int id;
    private String name;
    private String producer;
    private double price;
    private int quantity;

    public Stock() {
    }

    public Stock(int id, String name, String producer, double price, int quantity) {
        super();
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}