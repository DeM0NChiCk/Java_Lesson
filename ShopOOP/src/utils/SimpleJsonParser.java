/* Парсер обрабатывает загружаемый файл, конвертирует объекты JSON в Product,
 с которыми может работать наша программа, и возвращает Product[] */
package utils;

import model.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleJsonParser {

    public static Product[] parseJsonProducts(String filePath) {
        List<Product> productList = new ArrayList<>(); // Для гибкости используется List
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            Map<String, String> currentProduct = null;

            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.equals("{")) {
                    currentProduct = new HashMap<>();
                } else if (line.equals("},") || line.equals("}")) {
                    if (currentProduct != null) {
                        // Создаём и добавляем продукт
                        try {
                            String name = currentProduct.get("name");
                            int position = Integer.parseInt(currentProduct.get("position"));
                            int count = Integer.parseInt(currentProduct.get("count"));
                            Product product = new Product(name, position, count);
                            productList.add(product);

                        } catch (NumberFormatException e) {
                            System.err.println("Ошибка парсинга числа в JSON: " + e.getMessage());
                        }
                        currentProduct = null; // Сброс для следующего продукта
                    }
                } else if (currentProduct != null) {
                    String[] parts = line.split(":");
                    if (parts.length == 2) {
                        String key = parts[0].trim().replaceAll("\"", "");
                        String value = parts[1].trim().replaceAll("[\",]", "");
                        currentProduct.put(key, value);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении или парсинге JSON файла: " + e.getMessage());
            return null;
        }

        // Конвертируем List в массив перед возвращением
        return productList.toArray(new Product[0]);
    }
}