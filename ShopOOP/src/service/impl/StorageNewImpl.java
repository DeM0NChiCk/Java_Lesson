package service.impl;

import enums.EnumStatusCode;
import model.Product;
import service.StorageNew;

public class StorageNewImpl implements StorageNew {
    @Override
    public void addProduct(Product[] products, Product product) {

    }

    @Override
    public void getAllProducts(Product[] products) {
        getAllProducts();
    }

    @Override
    public EnumStatusCode buyProducts(Product[] products, Product product) {
        return EnumStatusCode.SUCCESSFULLY;
    }

    @Override
    public Product[] storageExpansion(Product[] products, int extensionValue) {
        return new Product[0];
    }

    @Override
    public void deliveryProducts(Product[] storage, Product[] deliveryProducts) {

    }

    @Override
    public void getAllProducts() {

    }

    @Override
    public void log() {

    }
}
