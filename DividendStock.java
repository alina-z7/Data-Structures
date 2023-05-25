public class DividendStock extends Stock {
    private double accumulatedDivsValue; //total of all dividends paid to date
    private double currentDividendOfStock; //per share payment planned or paid
    private String stockName;

    public DividendStock(String sym, String name) {
        super(sym);
        stockName = name;
    }

    public DividendStock(String sym, double currentDividend) {
        super(sym);
        accumulatedDivsValue = 0.0;
        currentDividendOfStock = currentDividend;
    }

    public void payDiv(double amountPerShare) {
        accumulatedDivsValue += (getTotalNumShares() * amountPerShare);
    }

    public int profitLoss(double currentPricePerShare) {
        storeProfitOrLoss((super.profitLoss(currentPricePerShare) + accumulatedDivsValue));
        return (int) Math.round(getProfitOrLoss());
    }

}