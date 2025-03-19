import java.util.*;
import java.util.stream.Collectors;

class Product {
String name, category; double price;

public Product(String name, String category, double price) { this.name = name;
this.category = category; this.price = price;
}
}
public class ProductProcessing {
public static void main(String[] args) { List<Product> products = Arrays.asList(
new Product("Laptop", "Electronics", 1000), new Product("Phone", "Electronics", 800), new Product("TV", "Electronics", 1200), new Product("Shirt", "Clothing", 50),
new Product("Jeans", "Clothing", 80)
);
Map<String, List<Product>> groupedByCategory = products.stream()
.collect(Collectors.groupingBy(p -> p.category));
Map<String, Optional<Product>> mostExpensiveByCategory = products.stream()
.collect(Collectors.groupingBy(p -> p.category, Collectors.maxBy(Comparator.comparingDouble(p -> p.price))));
double avgPrice = products.stream()
.mapToDouble(p -> p.price)
.average()
.orElse(0);
System.out.println("Grouped by Category: " + groupedByCategory); System.out.println("Most Expensive Product in Each Category: " +
mostExpensiveByCategory); System.out.println("Average Price: " + avgPrice);
}
}
