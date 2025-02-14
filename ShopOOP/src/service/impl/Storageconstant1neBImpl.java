package service.impl;

import enums.EnumStatusCode;
import main.Main;
import model.Product;
import service.Storage;

import static enums.EnumStatusCode.*;

public class Storageconstant1neBImpl<T extends Product> implements Storage<T> {
    @Override
    public void addProduct(T[] products, T product) {
        try {
            int position = product.getPosition();
            if (position < 0 || position >= products.length) {
                throw new ArrayIndexOutOfBoundsException("Position продукта вне допустимого диапазона!");
            }
            products[position] = product;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage() + " в addProduct");
        }
    }

    @Override
    public void getAllProducts(T[] products) {
        for (T product : products) {
            if (product != null) {
                System.out.println("На складе: " + product.getCount() + " товаров с именем " + product.getName());
            }
        }
    }

    @Override
    public EnumStatusCode buyProducts(T[] products, T product) {
        try {
            int position = product.getPosition();
            if (position < 0 || position >= products.length || products[position] == null || products[position].getName().equals(product.getName())) {
                throw new ArrayIndexOutOfBoundsException("Position продукта вне допустимого диапазона или продукт отсутствует!");
            }
            if (products[position].getCount() - product.getCount() < 0 || product.getCount() <= 0) {
                return PRODUCT_IS_OUT_OF_STOCK;
            } else {
                for (int i = 1; i <= product.getCount(); i++) {
                    products[position].removeOne();
                }
                return SUCCESSFULLY;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage() + " в buyProduct");
            return ERROR_CODE;
        }

    }

    @Override
    public T[] storageExpansion(T[] products, int extensionValue) {
        T[] newStorage = (T[]) new Product[products.length * extensionValue];
        System.arraycopy(products, 0, newStorage, 0, products.length);
        return newStorage;
    }

    @Override
    public void deliveryProducts(T[] storage, T[] deliveryProducts) {
        T product = deliveryProducts[0];
        int position = product.getPosition();
        if (position < 0) {
            System.err.println("Position не может быть отрицательным");
            return;
        }
        if (product.getPosition() >= storage.length) {
            storage = storageExpansion(storage, 2);
        }
        addProduct(storage, product);
    }
}
