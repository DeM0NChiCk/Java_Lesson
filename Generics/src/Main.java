import model.AccId;
import model.Account;
import model.Printer;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Account<Integer, Integer> account1 = new Account<>(12, 1234);
        Account<String, Integer> account2 = new Account<>("nickname", 1234);
        Account<AccId, String> account3 = new Account<>(new AccId("id123124", 234), "234325");

        int idAccount1 = account1.getId();
        String idAccount2 = account2.getId();
        String idAccount3 = account3.getId().id;
        account2.setSum(223);

        System.out.println(idAccount1 + " " + account1.getSum());
        System.out.println(idAccount2 + " " + account2.getSum());
        System.out.println(idAccount3 + " " + account3.getSum());

        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
        Printer.print(people);
        Printer.print(numbers);

    }
}