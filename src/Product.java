public abstract class Product {
    private int id;
    private String name;
    private double price;
    private int piece;
    private boolean stock; // stokta olup olmadığını kontrol etme

    public Product(int id, String name, double price, int piece) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = false;
        this.piece = piece;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getPiece() {
        return piece;
    }
    public void setPiece(int piece) {
        this.piece = piece;
    }

    public abstract String getCategory(); //

    public abstract void checkOut() throws StockMaterialUnavailableException;
}

