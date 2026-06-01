import java.util.Arrays;
import java.util.Objects;
// Вот класс Order
public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Заказ[клиент=" + customer + ", товары=" + Arrays.toString(basket) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Order order = (Order) obj;
        if (!Objects.equals(customer, order.customer)) return false;

        // Сравнение массивов basket
        if (basket == null && order.basket != null) return false;
        if (basket != null && order.basket == null) return false;

        if (basket.length != order.basket.length) return false;

        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                if (order.basket[i] != null) return false;
            } else if (!basket[i].equals(order.basket[i])) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(customer);
        result = 31 * result + Arrays.hashCode(basket);
        return result;
    }
}
