package OOPsProgramming;

import java.util.ArrayList;
import java.util.List;

public class StockPortfolio {
    private ArrayList<Stock> stocks;

    public StockPortfolio() {
        stocks = new ArrayList<>();
    }

    public void addStock(Stock st) {
        stocks.add(st);
    }

    public void displayReport(){
        double totalValue = 0;
        for (Stock stock : stocks) {
            double stockValue = stock.getStockValue();
            System.out.println("Stock: " + stock.stockName + ", Value: " + stockValue);
            totalValue += stockValue;
        }
        System.out.println("Total Portfolio Value: " + totalValue);
    }
}
