import java.util.List;

public class Menu {

    public static void showthemenu(List<Product> productlist) {
        System.out.println("MENU");

        for (int i = 0; i < productlist.size(); i++) {
            Product product = productlist.get();
            System.out.print( product.getId());
            System.out.print(product.getName() + "PRİCE:" + product.getPrice() + "TL");
            System.out.println("Stock: " + product.getPiece());
        }

        System.out.println("log out / end the shopping");
    }

    public static Product ProductById(List<Product> list, int choosenId) {
        for (Product p : list) {
            if (p.getId() == choosenId) {
                return p;
            }
        }
        return null;
    }
}
