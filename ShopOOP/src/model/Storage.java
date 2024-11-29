package model;

public class Storage {

    // TODO: реализовать во всех методах проверку того, что position не превышает размерности массива
    // TODO: написать try()...catch(), чтобы программа продолжала работу

    public void addProducts(Product[] products, Product product) {
        products[product.getPosition()] = product;
    }

    public void getProducts(Product[] products) {
        for (Product product : products) {
            System.out.println("На складе: " + product.getCount() + " товаров с именем " + product.getName());
        }
    }

    public void buyProducts(Product[] products, Product product) {
        products[product.getPosition()].removeOne();
    }

    //TODO:
    // addNewStorage()
    // Реализовать переезд на новый склад/расширение склада (метод должен возвращать массив нового размера)


    private Product[] productsOne;
    // Поле теперь private

    public void addNewStorage(Product[] productsOne) {

        // вычисляем длинну массива
        int oldLength = productsOne.length;
        // создаем новый массив прибавляя к старому 10
        Product[] productsNew = new Product[oldLength + 10];
        // переносим старые значения в новый массив
        System.arraycopy(productsOne, 0, productsNew, 0, oldLength);
        // заменяем старый массив новым
        this.productsOne = productsNew;

    }

    public Product[] getProductsOne() {
        return productsOne;
    }

    public void setProductsOne(Product[] productsOne) {
        this.productsOne = productsOne;
    }

    // TODO:
    //  deliveryProducts()
    //  реализовать пополнение товаров на складе.
}


