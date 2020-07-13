
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Manager {
    static Scanner scan = new Scanner(System.in);
    static List<Category> listCate = new ArrayList<>();
    static List<Product> listPro = new ArrayList<>();
    static List<Product> listSell = new ArrayList<>();
    static List<Product> listInventory = new ArrayList<>();
    static List<Product> listEndDate = new ArrayList<>();
    static List<Product> listRest = new ArrayList<>();
    static List<Product> listAlmostEndDate = new ArrayList<>();


    public Manager() {

    }

    public void importCategory() {

        System.out.println("Nhap n danh muc :");

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            Category category = new Category();
            category.inputCategory();
            listCate.add(category);
        }
        listCate.forEach(Category::display);


    }

    public static void inputProduct() {

        System.out.println("Nhap n san pham muon them : ");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            Product product = new Product();
            product.inputProduct(listCate);
            listPro.add(product);
        }
        System.out.println("danh sach cac san pham cap nhat");
        listPro.forEach(Product::displayProduct);

    }


    public void Sell() {

        listPro.stream().filter((product1) -> (!"".equals(product1.getOutputDate()))).forEachOrdered((product1) -> {
            listSell.add(product1);
        });
        System.out.println("Danh sach san pham da ban :");
        for (int i = 0; i < listSell.size(); i++) {
            listSell.get(i).displayProduct();
        }

    }


    public void Inventory() {

        listPro.stream().filter((product1) -> ("".equals(product1.getOutputDate()))).forEachOrdered((product1) -> {
            listInventory.add(product1);
        });
        System.out.println("Danh sach san pham ton kho : ");
        for (int i = 0; i < listInventory.size(); i++) {
            listInventory.get(i).displayProduct();
            System.out.println("----------------------------------------");
        }
    }

    public int EndDate(String d1) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int timeDif = 0;
        boolean check = false;

        try {

            Date current = new Date();
            String nowDate = sdf.format(current);
            Date date1 = sdf.parse(d1);
            Date date2 = sdf.parse(nowDate);

            timeDif = (int) (date2.getTime() - date1.getTime());
            timeDif = timeDif / (24 * 60 * 60 * 1000);
        } catch (ParseException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return timeDif;
    }


    public void Rest() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (int i = 0; i < listRest.size(); i++) {
            if (EndDate(listInventory.get(i).getDateEnd()) > 0) {
                listEndDate.add(listInventory.get(i));
            } else {
                listRest.add(listInventory.get(i));
            }
        }
        System.out.println("Danh sach cac san pham het han:");

        for (Product product : listEndDate) {
            product.displayProduct();
        }
    }


    public void AlmostEndDate() {
        int count = 0;
        for (Product product : listRest) {
            if (EndDate(product.getDateEnd()) <= 7) {
                count++;
                listAlmostEndDate.add(product);
            }
        }
        if (count != 0) {

            System.out.println("Danh sach san pham sap het han su dung : ");
            listAlmostEndDate.forEach(Product::displayProduct);
        } else {
            System.out.println("Khong co san pham nao sap het HSD !!!");
        }
    }

    //search
    public void SearchProduct() {
        int count = 0;
        System.out.println("Nhap ten san pham can tim : ");
        String findName = scan.nextLine();
        System.out.println("Ket qua: " + findName);
        for (int i = 0; i < listPro.size(); i++) {
            if (findName.equalsIgnoreCase(listPro.get(i).getNamePro())) {
                listPro.get(i).displayProduct();
                count++;
            }
        }
        System.out.println("So luong la : " + count);
    }

    //    // luu file danh muc
    public static void saveFileCategory() {
        String url = "D:\\JAVA\\CaseStudyModule2\\src\\category.txt";
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

        try {
            fos = new FileOutputStream(url);
            bos = new BufferedOutputStream(fos);

            for (Category category : listCate) {
                String line = category.formatLine();
                byte[] b;
                b = line.getBytes(StandardCharsets.UTF_8);
                bos.write(b);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (bos != null) {
                    bos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void readFileCategory() {
        listCate.clear();
        String url = "D:\\JAVA\\CaseStudyModule2\\src\\category.txt";
        FileReader reader = null;
        BufferedReader bufferedReader = null;

        try {
            reader = new FileReader(url);
            bufferedReader = new BufferedReader(reader);

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                Category category = new Category();
                category.getLine(line);
                listCate.add(category);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Danh sach danh muc san pham:");
        listCate.forEach(Category::display);
    }

    public static void saveFileProduct() {
        String url = "D:\\JAVA\\CaseStudyModule2\\src\\product.txt";
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

        try {
            fos = new FileOutputStream(url);
            bos = new BufferedOutputStream(fos);

            for (Product product : listPro) {
                String line = product.formatLine();
                byte[] b;
                b = line.getBytes(StandardCharsets.UTF_8);
                bos.write(b);
            }
        } catch (IOException ex) {

            ex.printStackTrace();
        } finally {
            try {
                if (bos != null) {
                    bos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ex) {

                ex.printStackTrace();
            }
        }
    }

    public static void readFileProduct() {
        listPro.clear();
        String url = "D:\\JAVA\\CaseStudyModule2\\src\\product.txt";
        FileReader reader = null;
        BufferedReader bufferedReader = null;

        try {
            reader = new FileReader(url);
            bufferedReader = new BufferedReader(reader);

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                Product product = new Product();
                product.getLine(line);
                listPro.add(product);
            }
        } catch (IOException ex) {

            ex.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {

                ex.printStackTrace();
            }
        }
        System.out.println("Danh sach san pham:");
        listPro.forEach(Product::displayProduct);
    }

    public static void editProduct() {
        boolean isExisted = false;

        System.out.println("Nhap id san pham can sua:");
        String id = scan.nextLine();
        System.out.println("Nhap ten sp can sua ");
        String name = scan.nextLine();
        System.out.println("Nhap ma danh muc sp can sua");
        String catId = scan.nextLine();
        System.out.println("Nhap gia sp can sua");
        String price = scan.nextLine();
        System.out.println("Nhap so luong san pham");
        String quantity = scan.nextLine();
        System.out.println("Nhap ngay nhap sp can sua");
        String indate = scan.nextLine();
        System.out.println("Nhap ngay ban sp can sua");
        String outdate = scan.nextLine();
        System.out.println("Nhap hsd sp can sua");
        String expire = scan.nextLine();
        System.out.println("Nhap mo ta sp can sua");
        String note = scan.nextLine();

        for (Product editProduct : listPro) {
            if (editProduct.getIdPro().equals(id)) {
                isExisted = true;
                editProduct.setNamePro(name);
                editProduct.setMaDanhMuc(catId);
                editProduct.setPrice(price);
                editProduct.setQuantity(quantity);
                editProduct.setInputDate(indate);
                editProduct.setOutputDate(outdate);
                editProduct.setDateEnd(expire);
                editProduct.setDescribe(note);
                break;
            }
        }
        if (!isExisted) {
            System.out.println("Khong tim thay id san pham ");
        } else {
            saveFileProduct();
        }
        System.out.println("danh sach cac san pham cap nhat");
        listPro.forEach(Product::displayProduct);
    }

    public static void deleteProduct() {
            Product product = null;
        System.out.println("Nhap id san pham can xoa: ");
        String id = scan.nextLine();
        for (int i = 0; i< listPro.size();i++) {
            if (listPro.get(i).getIdPro().equals(id)) {
                product = listPro.get(i);
                break;
            }
        }
        if(product != null) {
                listPro.remove(product);
                saveFileProduct();
            } else {
                System.out.print("id nay khong ton tai.");
//
            }
        System.out.println("danh sach cac san pham cap nhat");
        listPro.forEach(Product::displayProduct);
        }


    static void sort() {

        System.out.println("Sap xep theo ten san pham theo ten");
        listPro.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getNamePro().compareTo(o2.getNamePro());
            }
        });
        for (int i = 0; i < listPro.size(); i++) {
            listPro.get(i).displayProduct();
        }
    }
}






