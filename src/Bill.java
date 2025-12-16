import java.util.List;

public class Bill {
    private List<Dish> dishes;
    private List<Beverage> beverages;

    public Bill(List<Dish> dishes, List<Beverage> beverages) {
        this.dishes = dishes;
        this.beverages = beverages;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Dish dish : dishes) {
            totalPrice += dish.getPrice();
        }

            for (Beverage beverage : beverages) {
                totalPrice +=beverage.getPrice();
            }
            return totalPrice;
    }
}