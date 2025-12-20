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

    //amacımız hatayı çözmek değil bildirmek olduğu için try catch değil throw kullandım
    //(duruma göre eğer exception olarak değil de ne stock olarak çıktı vermek istersek değiştiririm try catch ile)
    @Override
    public void checkOut()throws StockMaterialUnavailableException{
        if(getPiece () <= 0){
            throw new StockMaterialUnavailableException("NO STOCK" + getName());
        };
        setPiece (getPiece() - 1 );
    }




}
    } 
        setPiece (getPiece() - 1 );

}
