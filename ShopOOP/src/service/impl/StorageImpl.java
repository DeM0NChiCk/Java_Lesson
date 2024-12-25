package service.impl;

import main.Main;
import model.Product;
import service.Storage;
import service.StorageNew;

public class StorageImpl implements Storage {
    @Override
    public void addProduct(Product[] products, Product product) {
        products[product.getPosition()] = product;
    }

    @Override
    public void getAllProducts(Product[] products) {
        for (Product product : products) {
            System.out.println("На складе: " + product.getCount() + " товаров с именем " + product.getName());
        }
    }

    @Override
    public int buyProducts(Product[] products, Product product) {
        if (product.getCount() <= 0) {
            return Main.PRODUCT_IS_OUT_OF_STOCK;
        } else {
            for (int i = 1; i <= product.getCount(); i++) {
                products[product.getPosition()].removeOne();
            }
            return Main.SUCCESSFULLY;
        }

    }

    // ранее addNewStorage()
    @Override
    public Product[] storageExpansion(Product[] products, int extensionValue) {

        return new Product[products.length + extensionValue];

        // TODO:
    }

    @Override
    public void deliveryProducts(Product[] storage, Product[] deliveryProducts) {
        // TODO:
        //  реализовать пополнение товаров на складе от поставщика.
    }

    public Storage returnNewStorage(Storage storage) {
        return storage;
    }
}