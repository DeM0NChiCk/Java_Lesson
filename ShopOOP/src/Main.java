import model.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет магазин!");

        Storage storage = new Storage(3);



//
//        System.out.println("Начало дня: " + Product.counterProducts);
//        Storage storage = new Storage();
//
//        Product[] productsOne = new Product[3];
//        System.out.println(Arrays.toString(productsOne));
//
//        productsOne[0] = new Product("table", 0, 5);
//        productsOne[1] = new Product("chair", 1, 10);
//        productsOne[2] = new Product("bookshelf", 2, 3);
//
//        Product[] productsTwo = {
//                new Product("table", 0, 5),
//                new Product("chair", 1, 10),
//                new Product("bookshelf", 2, 3)
//        };

        //TODO: Product[] newStorаge = storage.addNewStorage();

        Product table = new Product("table", 0, 5);
        Product chair = new Product("chair", 1, 10);
        Product bookshelf = new Product("bookshelf", 2, 3);


        storage.addProduct(table);
        storage.addProduct(chair);
        storage.addProduct(bookshelf);

        System.out.println("Начальное состояние склада:");
        System.out.println(table.toString());
        System.out.println(chair.toString());
        System.out.println(bookshelf.toString());


        storage.restockProduct("table", 150);
        storage.restockProduct("chair" , 10);
        storage.restockProduct("bookshelf", 50);
        System.out.println("Cостояние склада после пополнения:");
        System.out.println(table.toString());
        System.out.println(chair.toString());
        System.out.println(bookshelf.toString());






//
//        Product[] productsThree = new Product[3];
//
//        storage.addProducts(productsThree, table);
//        storage.addProducts(productsThree, chair);
//        storage.addProducts(productsThree, bookshelf);
//
//        System.out.println(Arrays.toString(productsOne));
//        System.out.println(Arrays.toString(productsTwo));
//        System.out.println(Arrays.toString(productsThree));
//
//        storage.getProducts(productsThree);
//        storage.buyProducts(productsThree, table);
//
//        Employee employee1 = new Employee(
//                1,
//                "Russia",
//                24,
//                1L
//        );
//        Employee employee2 = new Employee(
//                2,
//                "Russia",
//                30,
//                2L
//        );
//
//        System.out.println(employee1.getEmployeeCard());
//        System.out.println(employee2.getEmployeeCard());
//
//
//        Buyer buyer1 = new Buyer(
//                1,
//                "Russia",
//                -1,
//                "Вася",
//                "Kazan"
//        );
//
//        Buyer buyer2 = new Buyer(
//                1,
//                "French",
//                -1,
//                "Василиса",
//                "Paris"
//        );
//
//        System.out.println(buyer1.getAge());
//
//        Employee employee3 = new Employee(
//                3,
//                "Russia",
//                -30,
//                3L
//        );
//        System.out.println(employee3.getAge());
//
//
//        User buyer3 = new Buyer(
//                1,
//                "French",
//                -1,
//                "Василиса",
//                "Paris"
//        );
//
//        System.out.println(buyer3.getAge());
//        System.out.println(buyer3.getUsername());
//
//        User child1 = new Child(
//                1,
//                "French",
//                -1,
//                "Марина",
//                "Paris"
//        );
//
//        System.out.println(child1.getAge());

        // TODO: подумать над реализацией static методов

    }

}