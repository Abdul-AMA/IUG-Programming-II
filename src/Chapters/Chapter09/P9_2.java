package Chapters.Chapter09;

public class P9_2 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL" , "Oracle Corporation");
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);
        System.out.print("the price-change percentage is " + stock.getChangePercent() + "%");
    }
}

class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    double getChangePercent(){
        return  (currentPrice - previousClosingPrice) / (previousClosingPrice ) * 100 ;
    }


}
