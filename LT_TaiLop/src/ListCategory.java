

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class DataMgr {
    List<Category> listCategory = null;
    List<Product> listProduct = null;
    private static DataMgr instance;

    public DataMgr() {
        listCategory = new ArrayList<>();
        listProduct = new ArrayList<>();
    }

    public static synchronized DataMgr getInstance() {
        if (instance == null) {
            instance = new DataMgr();
        }
        return instance;
    }

    public List<Product> getSoldProducts() {
        if (instance == null || instance.getListProduct() == null) return null;
        List<Product> soldProducts = new ArrayList<>();
        instance.getListProduct().stream().
                filter((product) -> product.isSold()).
                forEachOrdered((product) -> {
                    soldProducts.add(product);
                });
        return soldProducts;
    }

    public List<Product> getExpiryProducts() {
        if (instance == null || instance.getListProduct() == null) return null;
        List<Product> expiryProducts = new ArrayList<>();
        Date today = new Date();
        instance.getListProduct().stream().
                filter((product) -> (product.isExpire())).
                forEachOrdered((product) -> {
                    expiryProducts.add(product);
                });
        return expiryProducts;
    }

    public List<Product> getSoonExpiryProducts() {
        if (instance == null || instance.getListProduct() == null) return null;
        List<Product> soonExpiryProducts = new ArrayList<>();
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        cal.add(Calendar.DATE, 7);
        Date todayPlus7 = cal.getTime();
        DataMgr.getInstance().getListProduct().stream().
                filter((product) -> (product.isSoonExpire())).
                forEachOrdered(soonExpiryProducts::add);
        return soonExpiryProducts;
    }

    public List<Product> getRemainsProducts() {
        if (instance == null || instance.getListProduct() == null) return null;
        List<Product> remains = new ArrayList<>();
        instance.getListProduct().stream().filter((prod) -> (!prod.
                isExpire() && !prod.isSold())).forEachOrdered((prod) -> {
            remains.add(prod);
        });
        return remains;
    }

    public List<Category> getListCategory() {
        return listCategory;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }

    public void setListCategory(List<Category> listCategory) {
        this.listCategory = listCategory;
    }

    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }
}
