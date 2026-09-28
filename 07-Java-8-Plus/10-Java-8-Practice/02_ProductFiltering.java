/*
 * JAVA 8+
 * AREA: Java 8 Practice
 * CONCEPT: Product Filtering
 *
 * What is it?
 * This practice filters products based on price.
 *
 * Why do we need it?
 * Filtering is a common business operation in backend systems.
 *
 * Key points:
 * - filter() expresses the selection rule.
 * - map() can select the required response field.
 *
 * Interview note:
 * Explain why filter() comes before map() in this example.
 */

import java.util.Arrays;
import java.util.List;

class ProductData {
    private final String name;
    private final double price;

    ProductData(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Concept02_ProductFiltering {
    public static void main(String[] args) {
        List<ProductData> products = Arrays.asList(
                new ProductData("Laptop", 70000),
                new ProductData("Mouse", 800),
                new ProductData("Keyboard", 1500)
        );

        products.stream()
                .filter(product -> product.getPrice() > 1000)
                .map(ProductData::getName)
                .forEach(System.out::println);
    }
}