package OOPsProgramming;

public class Stock {
    String stockName;
    int numberOfShare;
    double sharePrice;

    public Stock(String stockName, int numberOfShare, int sharePrice) {
        this.stockName = stockName;
        this.numberOfShare = numberOfShare;
        this.sharePrice = sharePrice;
    }

    double getStockValue() {
        return numberOfShare * sharePrice;
    }
}