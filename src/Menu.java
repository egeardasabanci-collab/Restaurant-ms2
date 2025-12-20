
import java.util.List;

public class Menu {

    public static void show(List<Product> products) {
        System.out.println("\n=== MENU ===");
        for (Product p : products) {
            System.out.println(
                    p.getId() + " - " +
                            p.getName() + " | " +
                            p.getPrice() + "₺ | Stock: " +
                            p.getPiece()
            );
        }
        System.out.println("0 - Finish");
    }

    public static Product select(List<Product> products, int id) {
        for (Product p : products)
            if (p.getId() == id) return p;
        return null;
    }
}
