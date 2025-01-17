package service;

import enums.EnumStatusCode;
import model.Product;


// TODO: Добавить generic, то есть сделать интерфейс более универсальным
public interface Storage<T> {

    void addProduct(T[] products, T product);

    void getAllProducts(T[] products);

    EnumStatusCode buyProducts(T[] products, T product);

    Product[] storageExpansion(T[] products, int extensionValue);

    void deliveryProducts(T[] storage, T[] deliveryProducts);

}
