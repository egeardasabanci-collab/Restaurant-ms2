import java.util.*;

public class Bill {

    private List<Dish> dishes;
    private List<Beverage> beverages;
    private List<Product> products;

    // 🔹 ESKİ KULLANIM (KALSIN)
    public Bill(List<Dish> dishes, List<Beverage> beverages) {
        this.dishes = dishes;
        this.beverages = beverages;
    }

    // 🔹 YENİ KULLANIM
    public Bill() {
        products = new ArrayList<>();
    }

    // 🔹 YENİ AKIŞ İÇİN
    public void addProduct(Product p) {
        products.add(p);
    }

    // 🔹 YENİ FATURA
    public void printBill() {
        double total = 0;

        System.out.println("\n======= BILL =======");
        for (Product p : products) {
            System.out.println(
                    p.getCategory() + " " + p.getName() + " : " + p.getPrice() + "₺"
            );
            total += p.getPrice();
        }
        System.out.println("--------------------");
        System.out.println("TOTAL : " + total + "₺");
    }

    // 🔹 ESKİ HESAPLAMA (ISTERSEK KULLANIRIZ)
    public double calculateTotalPrice() {
        double total = 0;
        for (Dish d : dishes) total += d.getPrice();
        for (Beverage b : beverages) total += b.getPrice();
        return total;
    }
}
