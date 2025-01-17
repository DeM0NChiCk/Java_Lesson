package service;

import enums.EnumStatusCode;
import model.Product;


// TODO: Добавить generic, то есть сделать интерфейс более универсальным
public interface Storage<T> {

    void addProduct(Product[] products, Product product);

    void getAllProducts(Product[] products);

    EnumStatusCode buyProducts(Product[] products, Product product);

    Product[] storageExpansion(Product[] products, int extensionValue);

    void deliveryProducts(Product[] storage, Product[] deliveryProducts);

}
