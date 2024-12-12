package model;

import java.util.Arrays;

public class Storage {

    private Product[] products;
    private int count;

    public Storage(int capacity) {
        products = new Product[capacity];
        count = 0;
    }
    // TODO: реализовать во всех методах проверку того, что position не превышает размерности массива
    // TODO: написать try()...catch(), чтобы программа продолжала работу

    public void addProduct(Product product) {
        if (count == products.length) {
            increaseCapacity();;
        }
        products[count++] = product;
    }

    public int getCount() {
        return count;
    }

    public void restockProduct(String productName, int additionalQuantity) {
        Product foundProduct = findProductByName(productName);
        if (foundProduct != null) {
            foundProduct.setCount(foundProduct.getCount() + additionalQuantity);
        } else {
            throw new RuntimeException("Товар: " + productName + " не найден на складе");
        }
    }

    public void removeProduct(String productName, int quantity) {
        Product product =findProductByName(productName);
        if (product != null && product.getCount() >= quantity) {
            product.setCount(product.getCount() - quantity);
        } else {
            throw new RuntimeException("Недостаточно товара на складе");
        }
    }





//    public void addProducts(Product[] products, Product product) {
//        products[product.getPosition()] = product;
//    }
//
//    public void getProducts(Product[] products) {
//        for (Product product : products) {
//            System.out.println("На складе: " + product.getCount() + " товаров с именем " + product.getName());
//        }
//    }
//
//    public void buyProducts(Product[] products, Product product) {
//        products[product.getPosition()].removeOne();
//    }
//
//    public void addNewStorage() {
//
//    }

    private void increaseCapacity() {
        products = Arrays.copyOf(products, products.length * 2);
    }

    private Product findProductByName(String productName) {
        for (Product product : products) {
            if (product != null && product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }



    //TODO:
    // addNewStorage()
    // Реализовать переезд на новый склад/расширение склада (метод должен возвращать массив нового размера)

    // TODO:
    //  deliveryProducts()
    //  реализовать пополнение товаров на складе.


}
