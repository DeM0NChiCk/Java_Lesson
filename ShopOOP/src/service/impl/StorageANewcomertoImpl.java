package service.impl;

import enums.EnumStatusCode;
import main.Main;
import model.Product;
import service.Storage;

import static enums.EnumStatusCode.PRODUCT_IS_OUT_OF_STOCK;
import static enums.EnumStatusCode.SUCCESSFULLY;

public class StorageANewcomertoImpl implements Storage {
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
    public EnumStatusCode buyProducts(Product[] products, Product product) {
        if (product.getCount() <= 0) {
            return PRODUCT_IS_OUT_OF_STOCK;
        } else {
            for (int i = 1; i <= product.getCount(); i++) {
                products[product.getPosition()].removeOne();
            }
            return SUCCESSFULLY;
        }
    }

    @Override
    public Product[] storageExpansion(Product[] products, int extensionValue) {
        // вычисляем длинну массива
        int oldLength = products.length;
        // создаем новый массив прибавляя к старому 10
        Product[] productsNew = new Product[oldLength + extensionValue];
        // переносим старые значения в новый массив
        System.arraycopy(products, 0, productsNew, 0, oldLength);
        // заменяем старый массив новым
        return productsNew;
    }

    @Override
    public void deliveryProducts(Product[] storage, Product[] deliveryProducts) {

    }
}
