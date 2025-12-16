public class Dish extends Product{
    private double grammage; // yiyecek gramaj bilgisi

    public Dish(int id, String name, double price, boolean stock,int piece, double grammage) {
        super(id, name, price, piece);
        this.grammage = grammage;
    }
    public double getGrammage() {
        return grammage;
    }
    public void setGrammage(double grammage) {
        this.grammage = grammage;
    }

    @Override
    public String getCategory(){
        return "--Food--";
    }

    @Override
    public void checkOut(){ // try/catch yapılacak

    }
    


}
