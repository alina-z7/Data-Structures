public class Equity {
    private String symbol;
    private String stockName;
    private double totalNumShares;
    private double totalCost;
    private double profitOrLoss;

    public Equity() {
        stockName = "unknown";
        symbol = "unknown";
    }

    public Equity(String sym) {
        if (sym == null && sym == "") {
            throw new NullPointerException();
        }
        symbol = sym;
        totalCost = 0.0;
        totalNumShares = 0;
        profitOrLoss = 0.0;
    }

    public void addTotalNumShares(double numberOfShares) {
        totalNumShares += numberOfShares;
    }

    public double getTotalNumShares() {
        return totalNumShares;
    }

    public void addTotalCost(double singleCost) {
        totalCost += singleCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void storeProfitOrLoss(double individualProfit) {
        profitOrLoss = individualProfit;
    }

    public double getProfitOrLoss() {
        return profitOrLoss;
    }

    public String toString() {
        return "The profit/loss for " + symbol + ": " + "$" + Math.round(profitOrLoss);
    }
}