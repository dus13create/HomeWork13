//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(1, "Товар A", 100, "Категория 1");
        Product product2 = new Product(2, "Товар B", 200, "Категория 2");
        Product product3 = new Product(1, "Товар A", 100, "Категория 1");

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product1.equals(product2)); // false
        System.out.println(product1.equals(product3)); // true

        Product[] basket1 = {product1, product2};
        Product[] basket2 = {product1, product2};
        Order order1 = new Order("Клиент 1", basket1);
        Order order2 = new Order("Клиент 1", basket2);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order1.equals(order2)); // true
    }

}