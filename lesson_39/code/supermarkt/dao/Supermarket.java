package supermarkt.dao;

import supermarkt.model.Product;

public interface Supermarket {

    boolean addProduct(Product product);
    Product removeProduct(long barCode);
    Product findByBrand(long brand);
    Iterable<Product> findBYCategory(String category);
    Iterable<Product> findByBrand(String brand);
    Iterable<Product> findProductsWithExpiredDate();
    int skuQuantity();

}


