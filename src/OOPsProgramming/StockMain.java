package OOPsProgramming;

public class StockMain {
    public static void main(String[] args){
        StockPortfolio s = new StockPortfolio();
        s.addStock(new Stock("Microsoft", 15, 200));
        s.addStock(new Stock("Google", 20, 2600));
        s.addStock(new Stock("Amazon", 25, 2100));

        s.displayReport();
    }
}
