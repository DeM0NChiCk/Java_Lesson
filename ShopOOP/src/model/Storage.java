package model;

import java.util.Arrays;
import java.util.Scanner;
public class Storage {

    // TODO: реализовать во всех методах проверку того, что position не превышает размерности массива
    // TODO: написать try()...catch(), чтобы программа продолжала работу

    public void addProducts(model.Product[] products, model.Product product) {
        products[product.getPosition()] = product;
    }

    public void getProducts(model.Product[] products) {
        for (model.Product product : products) {
            System.out.println("На складе: " + product.getCount() + " товаров с именем " + product.getName());
        }
    }

    public void buyProducts(model.Product[] products, model.Product product) {
        products[product.getPosition()].removeOne();
    }

    public static model.Product[] addNewStorage(model.Product[] array, model.Product[] arrayNew, int plusNumber){
//      model.Product[] productsOneNew = new model.Product[array.length + plusNumber];
        for (int i =0; i < array.length; i++) {
            arrayNew[i] = array[i];
        }
        System.out.println(Arrays.toString(arrayNew));
        return arrayNew;
    }

    public void printArray(model.Product[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] !=null) {
                if (i != array.length-1) {
                    System.out.println("На складе: " + array[i].getCount() + " товаров с именем " + array[i].getName());
                } else {
                    System.out.println("На складе: " + array[i].getCount() + " товаров с именем " + array[i].getName());
                    System.out.println("Склад полный, свободных мест нет!!!");
                }
            } else {
                System.out.println("Количество свободных позиций для новых видов товара на складе  " + (array.length-i));
                return;
            }
        }
    }

    public void addNewPositoin(model.Product[] array){
        Scanner scan = new Scanner(System.in);
        int i;
        int numberOfNewPosition;
        int numberOfNullElements = 0;

        for (i = 0; i < array.length; i++){
            if (array[i] == null) {
                numberOfNullElements = numberOfNullElements + 1;
            }
        }

        System.out.println("Введите количеcтво новых позиций");
        numberOfNewPosition = scan.nextInt();
        while (array.length-numberOfNullElements+numberOfNewPosition > array.length){
            System.out.println("Вы ввели количество позиций больше, чем вмещает склад!");
            System.out.println("Введите количество позиций не больше " + numberOfNullElements);
            numberOfNewPosition = scan.nextInt();
        }
        for (i = (array.length - numberOfNullElements); i < array.length - numberOfNullElements + numberOfNewPosition; i++){
            System.out.println("Введите наименование продукции");
            String inputName = scan.next();
            System.out.println("Введите количество продукции");
            int inputCount = scan.nextInt();
            array[i] = new model.Product(inputName, i, inputCount);
        }
    }


    //TODO:
    // addNewStorage()
    // Реализовать переезд на новый склад/расширение склада (метод должен возвращать массив нового размера)

    // TODO:
    //  deliveryProducts()
    //  реализовать пополнение товаров на складе.


}