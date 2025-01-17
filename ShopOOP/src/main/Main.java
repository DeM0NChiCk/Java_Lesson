package main;

import enums.EnumStatusCode;
import enums.ShopEnum;
import service.impl.StorageANewcomertoImpl;
import service.impl.Storageconstant1neBImpl;
import utils.Logger;
import model.*;
import service.Storage;

import utils.TimeLogger;

import java.util.Arrays;

import static enums.EnumStatusCode.*;

public class Main {

    public static Logger logger;

    public static void main(String[] args) {

        logger = new TimeLogger();
        System.out.println("Привет магазин!");

        System.out.println("Начало дня: " + Product.counterProducts);

        Storage storage = new Storageconstant1neBImpl();

        //TODO: Product[] newStorаge = storage.addNewStorage();

        Product table = new Product("table", 0, 5);
        Product chair = new Product("chair", 1, 10);
        Product bookshelf = new Product("bookshelf", 2, 3);

        Product[] products = new Product[3];

        storage.addProduct(products, table);
        storage.addProduct(products, chair);
        storage.addProduct(products, bookshelf);

        Product test_table = new Product(table.getName(), table.getPosition(), 3);
        Product test_table_null = new Product(table.getName(), 4, 3);
        Product test_table_PRODUCT_IS_OUT_OF_STOCK = new Product(table.getName(), -2, 4);
        Product test_bookshelf_PRODUCT_IS_OUT_OF_STOCK = new Product(bookshelf.getName(), table.getPosition(), 1);

        storage.getAllProducts(products);

        check_buy(products, test_table, storage);
        storage.getAllProducts(products);
        check_buy(products, test_table_null, storage);
        storage.getAllProducts(products);
        check_buy(products, test_table_PRODUCT_IS_OUT_OF_STOCK, storage);
        storage.getAllProducts(products);

        System.out.println("\n");
        storage.getAllProducts(products);

        System.out.println("\n");
        System.out.println(Arrays.toString(products));

        products = storage.storageExpansion(products, 10);

        System.out.println("\n");
        System.out.println(Arrays.toString(products));

        Product testick = new Product("testick", 10, 3);
        Product testick2 = new Product("testick2", 31, 31);

        System.out.println("\n Проверка до testick");
        storage.getAllProducts(products);

        storage.addProduct(products, testick);

        System.out.println("\n Проверка после");
        storage.getAllProducts(products);

        ShopEnum.BUY_PRODUCT.action(products, testick2, storage);

        System.out.println("\n Проверка работы программы после не правильной позиции");
        System.out.println(Arrays.toString(products));

        Buyer buyer1 = new Buyer(
                1,
                "Russia",
                -1,
                "Вася",
                "Kazan"
        );

        System.out.println(buyer1);


//        Employee employee1 = new Employee(
//                1,
//                "Russia",
//                24,
//                1L
//        );
//
//        Employee employee2 = new Employee(
//                2,
//                "Russia",
//                30,
//                2L
//        );

//        System.out.println(employee1.getEmployeeCard());
//        System.out.println(employee2.getEmployeeCard());


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

//        Employee employee3 = new Employee(
//                3,
//                "Russia",
//                -30,
//                3L
//        );
//        System.out.println(employee3.getAge());

//
//        User buyer3 = new Buyer(
//                1,
//                "French",
//                -1,
//                "Вадим",
//                "Paris"
//        );

//        System.out.println(buyer3.getAge());
//        System.out.println(buyer3.getUsername());

//        User child1 = new Child(
//                1,
//                "French",
//                -1,
//                "Марина",
//                "Paris"
//        );

//        System.out.println(child1.getAge());

//        Student student1 = new Student(
//                1,
//                "Russia",
//                8,
//                "Ваня",
//                "Школа 1"
//        );

//        System.out.println("Student: " + student1.getAge());

//        User[] arrayUsers = new User[]{
//                employee1,
//                employee2,
//                employee3,
//                buyer1,
//                buyer2,
//                buyer3,
//                child1,
//                student1
//        };

//        FuncPrint.print("arrayUsers[0]: " + arrayUsers[0].getAge());
//        FuncPrint.print("arrayUsers[6]: " + arrayUsers[6].getAge());
//        FuncPrint.print("arrayUsers[7]: " + arrayUsers[7].getAge());

//        for (User user : arrayUsers) {
//            FuncPrint.print(user.getPass());
//        }
//
//        FuncPrint.print("arrayUsers[7]: " + arrayUsers[7].getPass());
//
//        FuncPrint.print("arrayUsers[7]: " + ((Student)arrayUsers[7]).getEducation());

//        Book book = new Book("Java. Complete Reference", "H. Shildt");
//
//        Printable journal = new Journal("Foreign Policy");
//
//        Printable[] printables = new Printable[] {
//                book,
//                journal
//        };
//
//        for (Printable prints: printables) {
//            prints.print();
//        }

    }

    static void check_buy(Product[] products, Product product, Storage storage) {
        switch (storage.buyProducts(products, product)) {
            case SUCCESSFULLY:
                System.out.println(SUCCESSFULLY.getTitle());
                break;
            case PRODUCT_IS_OUT_OF_STOCK:
                System.out.println(PRODUCT_IS_OUT_OF_STOCK.getTitle());
                break;
            case ERROR_CODE:
                System.out.println(ERROR_CODE.getTitle());
                break;
        }
    }

}