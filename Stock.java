public class Stock extends Equity {
    public Stock(String sym) {
        super(sym);
    }

    public void purchase(double sharesBought, double perSharePrice, double fee) {
        if (sharesBought < 0 || perSharePrice < 0) {
            throw new IllegalArgumentException();
        }
        addTotalNumShares(sharesBought);
        addTotalCost(sharesBought * perSharePrice + fee);
    }

    public int profitLoss(double currentPricePerShare) {
        storeProfitOrLoss((getTotalNumShares() * currentPricePerShare) - getTotalCost());
        return (int) Math.round(getProfitOrLoss());
    }

}