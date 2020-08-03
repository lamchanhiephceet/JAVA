package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{

    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "CPU 9th", "2000000", "CPU may tinh","Intel"));
        products.put(2, new Product(2, "SSD 500G", "1500000", "O SSD","Samsung"));
        products.put(3, new Product(3, "Motherboard GX2000", "3000000", "Bo mach chu","Gigabyte"));
        products.put(4, new Product(4, "LED 21", "4000000", "Man hinh may tinh","LG"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}