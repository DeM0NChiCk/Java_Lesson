import example.Example;
import example.ExampleComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.println();
//
//        List<String> list1 = new ArrayList<>();
//
//        list1.add("Tom");
//        list1.add("Alice");
//        list1.add("Kate");
//        list1.add("Sam");
//
//        System.out.println(list1.get(1) + "\n");
//
//        for(String person : list1){
//
//            System.out.println("list1: " + person);
//        }
//
//        list1.add(1, "Bob");
//
//        System.out.println(list1.get(1) + "\n");
//
//        for(String person : list1){
//
//            System.out.println("list1: " + person);
//        }
//
//        if(list1.contains("Tom")){
//
//            System.out.println("ArrayList содержит Tom");
//        } else {
//            System.out.println("ArrayList не содержит Tom");
//        }
//
//        // удалим несколько объектов
//        // удаление конкретного элемента
//        if(list1.remove("Kate")) {
//            System.out.println("Kate удалён");
//        }
//        // удаление по индексу
//        list1.remove(0);
//
//        for(String person : list1){
//
//            System.out.println("list1: " + person);
//        }
//
        Deque<String> countryG7 = new ArrayDeque<String>();
        // стандартное добавление элементов
        countryG7.add("Germany");
        System.out.println(countryG7);
        countryG7.addFirst("France"); // добавляем элемент в самое начало
        System.out.println(countryG7);
        countryG7.push("Great Britain"); // добавляем элемент в самое начало
        System.out.println(countryG7);
        countryG7.addLast("Spain"); // добавляем элемент в конец коллекции
        System.out.println(countryG7);
        countryG7.add("Italy");
        System.out.println(countryG7);
        countryG7.add("Germany");
        System.out.println(countryG7);

        Deque<String> countrySNG = new ArrayDeque<String>();

        countrySNG.add("Russia");
        countrySNG.add("Kaz");
        countrySNG.add("Bel");
        countrySNG.add("Y");
        countrySNG.add("A");

        int[] array2 = {1235, 223, 3321, 9, 5123, 6, 72, 8, 9, 1};

        Arrays.sort(array2);

        System.out.println(Arrays.toString(array2));

        Example[] exArray = {new Example(), new Example(), new Example()};

        Arrays.sort(exArray);

        System.out.println(Arrays.toString(exArray));


        Map<Integer, String> statesMap = new HashMap<Integer, String>();
        statesMap.put(1, "Germany");
        statesMap.put(2, "Spain");
        statesMap.put(4, "France");
        statesMap.put(3, "Italy");

        String first = statesMap.get(5);
        System.out.println(first);

        Set<Integer> keys = statesMap.keySet();

        System.out.println(keys);

        Collection<String> values = statesMap.values();

        System.out.println(values);

        statesMap.replace(1, "Poland");

        System.out.println(keys + "\n" + values);

        statesMap.remove(1);

        System.out.println(keys + "\n" + values);

        for(Map.Entry<Integer, String> item : statesMap.entrySet()){

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }

        Map<String, Deque<String>> category = new HashMap<>();

        category.put("G7", countryG7);
        category.put("SNG", countrySNG);

        for (Map.Entry<String, Deque<String>> item : category.entrySet()) {
            System.out.printf("Group: %s  Country array: %s", item.getKey(), item.getValue().getFirst());
        }







    }

}