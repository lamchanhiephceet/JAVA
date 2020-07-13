

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class MainTest {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        List<Category> listCategory = new ArrayList<>();
        List<Product> listProduct = new ArrayList<>();
        List<Product> listProductSell = new ArrayList<>();
        List<Product> listProductExpired = new ArrayList<>();
        for(;;){
            Date now = new Date(System.currentTimeMillis());
            showMenu();
            System.out.print("Choose: ");
            int choose = Integer.parseInt(input.nextLine());
            switch(choose){
                case 1:
                    for(;;){
                        Category category = new Category();
                        category.input();
                        listCategory.add(category);
                        System.out.println("Continue? y/n");
                        String dk = input.nextLine();
                        if("n".equalsIgnoreCase(dk)){
                            break;
                        }
                    }
                    break;
                case 2:
                    for(;;){
                        Product product = new Product();
                        product.input();
                        if(product.SellDate.compareTo(now)<0){
                            listProductSell.add(product);
                        }else if(product.ExpiredDate.compareTo(now)<0){
                            listProductExpired.add(product);
                        }else{
                            listProduct.add(product);
                        }
                        System.out.println("Continue? y/n");
                        String dk = input.nextLine();
                        if("n".equalsIgnoreCase(dk)){
                            break;
                        }
                    }
                    break;
                case 3:
                    for (Product product : listProductSell) {
                        product.output();
                    }
                    break;
                case 4:
                    for (Product product : listProduct) {
                        product.output();
                    }
                    break;
                case 5:
                    for (Product product : listProductExpired) {
                        product.output();
                    }
                    break;
                case 6:
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(now);
                    cal.add(Calendar.DAY_OF_YEAR, 7);
                    for (Product product : listProduct) {
                        if(product.ExpiredDate.compareTo(cal.getTime())<0){
                            product.output();
                        }
                    }
                    break;
                case 7:
                    int count = 0;
                    System.out.print("Find product Name: ");
                    String search = input.nextLine();
                    for (Product product : listProductExpired) {
                        if(product.Name.equals(search)){
                            product.output();
                            count++;
                        }
                    }
                    for (Product product : listProduct) {
                        if(product.Name.equals(search)){
                            product.output();
                            count++;
                        }
                    }
                    for (Product product : listProductSell) {
                        if(product.Name.equals(search)){
                            product.output();
                            count++;
                        }
                    }
                    if(count==0){
                        System.out.println("Not Found");
                    }else{
                        System.out.println(" - Quantity: "+count);
                    }
                    break;
                case 8:
                    FileOutputStream fosCategory = null;
                    ObjectOutputStream oosCategory = null;
                    FileOutputStream fosSell = null;
                    FileOutputStream fosExpired = null;
                    FileOutputStream fosProduct = null;
                    ObjectOutputStream oosSell = null;
                    ObjectOutputStream oosExpired = null;
                    ObjectOutputStream oosProduct = null;
                    try {
                        fosCategory = new FileOutputStream("category.txt");
                        oosCategory = new ObjectOutputStream(fosCategory);
                        oosCategory.writeObject(listCategory);
                        fosSell = new FileOutputStream("sell.txt");
                        oosSell = new ObjectOutputStream(fosSell);
                        oosSell.writeObject(listProductSell);
                        fosExpired = new FileOutputStream("expire.txt");
                        oosExpired = new ObjectOutputStream(fosExpired);
                        oosExpired.writeObject(listProductExpired);
                        fosProduct = new FileOutputStream("product.txt");
                        oosProduct = new ObjectOutputStream(fosProduct);
                        oosProduct.writeObject(listProduct);


                        System.out.println("\t-----Successfully save");
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    } finally{
                        if( fosCategory!=null){
                            try {
                                fosCategory.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if( fosSell!=null){
                            try {
                                fosSell.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if( fosExpired!=null){
                            try {
                                fosExpired.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if( fosProduct!=null){
                            try {
                                fosProduct.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if( oosCategory!=null){
                            try {
                                oosCategory.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if( oosSell!=null){
                            try {
                                oosSell.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if( oosExpired!=null){
                            try {
                                oosExpired.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if( oosProduct!=null){
                            try {
                                oosProduct.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                    break;
                case 9:
                    FileInputStream fisCategory = null;
                    FileInputStream fisSell = null;
                    FileInputStream fisExpired = null;
                    FileInputStream fisProduct = null;
                    ObjectInputStream oisCategory = null;
                    ObjectInputStream oisSell = null;
                    ObjectInputStream oisExpired = null;
                    ObjectInputStream oisProduct = null;
                    try {
                        fisSell = new FileInputStream("sell.txt");
                        oisSell = new ObjectInputStream(fisSell);
                        fisCategory = new FileInputStream("category.txt");
                        oisCategory = new ObjectInputStream(fisCategory);
                        fisExpired = new FileInputStream("expire.txt");
                        oisExpired = new ObjectInputStream(fisExpired);
                        fisProduct = new FileInputStream("product.txt");
                        oisProduct = new ObjectInputStream(fisProduct);

                        listCategory = (List<Category>) oisCategory.readObject();
                        listProduct = (List<Product>) oisProduct.readObject();
                        listProductExpired = (List<Product>) oisExpired.readObject();
                        listProductSell = (List<Product>) oisSell.readObject();

                        System.out.println("\t-----Successfully Read");

                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    } finally{
                        if(fisCategory!= null){
                            try {
                                fisCategory.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if(fisSell!= null){
                            try {
                                fisSell.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if(fisExpired!= null){
                            try {
                                fisExpired.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if(fisProduct!= null){
                            try {
                                fisProduct.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if(oisCategory!= null){
                            try {
                                oisCategory.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if(oisSell!= null){
                            try {
                                oisSell.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if(oisExpired!= null){
                            try {
                                oisExpired.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if(oisProduct!= null){
                            try {
                                oisProduct.close();
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }

    static void showMenu(){
        System.out.println("1. Insert Category");
        System.out.println("2. Insert Product");
        System.out.println("3. Show Sold Product");
        System.out.println("4. Show Product in Storage");
        System.out.println("5. Show Expired Product");
        System.out.println("6. Show Product close to Expired");
        System.out.println("7. Find Product");
        System.out.println("8. Save to file");
        System.out.println("9. Read from file");
    }
}
