public class Beverage extends Product {
    private double mL; // içecek miktarı bilgisi
    public Beverage(int id, String name, double price,int piece, boolean stock,double mL) {
        super (id,name,price,piece);
        this.mL=mL;
    }
    public double getML() {
        return mL;
    }
    public void setML(double mL) {
        this.mL = mL;
    }
    @Override
    public String getCategory() {
        return "--Drink--";
    }
    //dishteki ile aynı şekilde bu da istersek değiştiiririz şimdilik hata fırlatıyorum
    @Override
    public void checkOut() throws StockMaterialUnavailableException{
        if(getPiece()<=0){

            throw new StockMaterialUnavailableException("NO STOCK" + getName());

        }
        setPiece(getPiece() - 1);//stok azaltıyor
    }

}
