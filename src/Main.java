import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Product> menu = new ArrayList<>();
        menu.add(new Dish(3, "Mantı", 90, true, 5, 250));
        menu.add(new Dish(6, "Pide", 70, true, 4, 300));
        menu.add(new Beverage(8, "Cola", 30, 10, true, 330));
        menu.add(new Beverage(9, "Water", 10, 20, true, 500));

        Bill bill = new Bill();
        Scanner sc = new Scanner(System.in);

        while (true) {
            Menu.show(menu);
            System.out.print("Select product number: ");
            int id = sc.nextInt();

            if (id == 0) break;

            Product selected = Menu.select(menu, id);

            if (selected == null) {
                System.out.println("Invalid number!");
                continue;
            }

            try {
                selected.checkOut();
                bill.addProduct(selected);
                System.out.println("Added ✔");
            } catch (StockMaterialUnavailableException e) {
                System.out.println(e.getMessage());
            }
        }

        bill.printBill();
    }
}
