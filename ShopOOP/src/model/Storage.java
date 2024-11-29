package model;

public class Storage {

    // TODO: реализовать во всех методах проверку того, что position не превышает размерности массива
    // TODO: написать try()...catch(), чтобы программа продолжала работу

    public void addProducts(Product[] products, Product product) {
/*      Реализована проверка на нахождение продукта в допустимом диапазоне
        (продукт не может быть в отрицательном индексе или вне массива).*/
        try {
            int position = product.getPosition();
            if (position < 0 || position >= products.length) {
                throw new ArrayIndexOutOfBoundsException("Position продукта вне допустимого диапазона!");
            }
            products[position] = product;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void getProducts(Product[] products) {
        for (Product product : products) {
            if (product != null) {
                System.out.println("На складе: " + product.getCount() + " товаров с именем " + product.getName());
            }
        }
    }

    public void buyProducts(Product[] products, Product product) {
/*      Реализована проверка на нахождение продукта в допустимом диапазоне,
        а также наличия продукта на складе.*/
        try {
            int position = product.getPosition();
            if (position < 0 || position >= products.length || products[position] == null) {
                throw new ArrayIndexOutOfBoundsException("Position продукта вне допустимого диапазона или продукт отсутствует!");
            }
            products[position].removeOne();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    //TODO:
    // addNewStorage()
    // Реализовать переезд на новый склад/расширение склада (метод должен возвращать массив нового размера)

    public Product[] addNewStorage(Product[] products) {
/*      Метод увеличивает складское пространство в 2 раза.
        Вместо цикла for для копирования массива используется метод
        System.arraycopy согласно предложению от среды разработки.    */
        Product[] newStorage = new Product[products.length * 2];
        System.arraycopy(products, 0, newStorage, 0, products.length);
        return newStorage;
    }

    // TODO:
    //  deliveryProducts()
    //  реализовать пополнение товаров на складе.

    public void deliveryProducts(Product[] products, Product product) {
        int position = product.getPosition();
        if (position < 0) {
            System.err.println("Position не может быть отрицательным");
            return;
        }
        if (product.getPosition() >= products.length) {
            products = addNewStorage(products);
        }
        addProducts(products, product);
    }


}
