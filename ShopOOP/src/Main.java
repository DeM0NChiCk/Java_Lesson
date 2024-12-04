import model.Product;
import model.Storage;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Привет магазин!");

        System.out.println("Начало дня: " + Product.counterProducts);
        Storage storage = new Storage();

        Product[] productsOne = new Product[3];
//      System.out.println(Arrays.toString(productsOne));

        productsOne[0] = new Product("table", 1, 5);
        productsOne[1] = new Product("chair", 1, 10);
        productsOne[2] = new Product("bookshelf", 2, 3);

        Product[] productsTwo = {
                new Product("table", 0, 5),
                new Product("chair", 1, 10),
                new Product("bookshelf", 2, 3)
        };

        //TODO: Product[] newStorаge = storage.addNewStorage();

        Product table = new Product("table", 0, 5);
        Product chair = new Product("chair", 1, 10);
        Product bookshelf = new Product("bookshelf", 2, 3);

        Product[] productsThree = new Product[3];

        storage.addProducts(productsThree, table);
        storage.addProducts(productsThree, chair);
        storage.addProducts(productsThree, bookshelf);

//      System.out.println(Arrays.toString(productsOne));
//      System.out.println(Arrays.toString(productsTwo));
//      System.out.println(Arrays.toString(productsThree));

//      storage.getProducts(productsThree);
        storage.buyProducts(productsThree, table);
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число, на которое расширяется склад: ");
// расширение склада---------------------------------------------------------------------------
        int inputPlusNumber = scan.nextInt();
        Product[] productsOneNew = new Product[productsOne.length+inputPlusNumber];
        storage.addNewStorage(productsOne, productsOneNew, inputPlusNumber);
//      productsOneNew[3] = new Product("cupboard", 3, 2);
//      productsOneNew[4] = new Product("sofa", 3, 1);
        storage.printArray(productsOneNew);
        storage.addNewPositoin(productsOneNew);
        storage.printArray(productsOneNew);
//----------------------------------------------------------------------------------------------
        // TODO: подумать над реализацией static методов

    }


}