


import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class Product implements Serializable {
    String IdPro, maDanhMuc;
    String NamePro, inputDate, outputDate, dateEnd, describe;
    String price;
    String quantity;

    public Product() {
    }

    public Product(String IdPro, String maDanhMuc, String price, String quantity, String NamePro, String inputDate, String outputDate, String dateEnd, String describe) {
        this.IdPro = IdPro;
        this.maDanhMuc = maDanhMuc;
        this.price = price;
        this.quantity = quantity;
        this.NamePro = NamePro;
        this.inputDate = inputDate;
        this.outputDate = outputDate;
        this.dateEnd = dateEnd;
        this.describe = describe;
    }

    public String getIdPro() {
        return IdPro;
    }

    public void setIdPro(String IdPro) {
        this.IdPro = IdPro;
    }

    public String getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(String maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getNamePro() {
        return NamePro;
    }

    public void setNamePro(String NamePro) {
        this.NamePro = NamePro;
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate;
    }

    public String getOutputDate() {
        return outputDate;
    }

    public void setOutputDate(String outputDate) {
        this.outputDate = outputDate;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" + "IdPro=" + IdPro + ", maDanhMuc=" + maDanhMuc + ", price=" + price + ", so luong=" + quantity +", NamePro=" + NamePro + ", inputDate=" + inputDate + ", outputDate=" + outputDate + ", dateEnd=" + dateEnd + ", describe=" + describe + '}';
    }

    public void inputProduct(List<Category> Category) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Moi ban nhap ma san pham : ");
        IdPro = scan.nextLine();
        while (true) {
            System.out.println("Moi ban nhap ma danh muc : ");
            maDanhMuc = scan.nextLine();
            boolean check = false;
            for (Category Category1 : Category) {
                if (!Category1.getIdCate().equalsIgnoreCase(maDanhMuc)) {
                    continue;
                }
                check = true;
                break;
            }
            if (check) {
                break;
            } else {
                System.err.println("Ma danh muc nay khong ton tai !!!");
            }
        }
        System.out.println("Moi ban nhap ten san pham : ");
        NamePro = scan.nextLine();

        System.out.println("Moi ban nhap gia san pham : ");
        price = scan.nextLine();

        System.out.println("So luong san pham: ");
        quantity = scan.nextLine();

        System.out.println(" Ngay nhap san pham : ");
        inputDate = scan.nextLine();

        System.out.println("Nhap ngay ban san pham :");
        outputDate = scan.nextLine();

        System.out.println("Nhap han su dung:");
        dateEnd = scan.nextLine();

        System.out.println("Nhap mo ta san pham : ");
        describe = scan.nextLine();
    }


    public String formatLine() {
        return IdPro + "," + maDanhMuc + "," + NamePro + "," + price + "," + quantity + "," + inputDate + "," + outputDate + "," + dateEnd + "," + describe + "\n";
    }
    public void displayProduct() {
        System.out.println(toString());
        System.out.println("-----------------------------------------");
    }

    void getLine(String line) {
        line = line.trim();
        String[] data = line.split(",");
        if (data.length < 9) {
            System.out.println("Data error");
            return;
        }
        this.IdPro = data[0];
        this.maDanhMuc = data[1];
        this.NamePro = data[2];
         this.price = data[3];
        this.quantity = data[4];
        this.inputDate = data[5];
        this.outputDate = data[6];
        this.dateEnd = data[7];
        this.describe = data[8];
    }

}
