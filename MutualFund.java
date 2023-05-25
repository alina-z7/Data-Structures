public class MutualFund extends Equity {
    private double totalFractionalShares;
    private String stockName;

    public MutualFund(String sym, String name) {
        super(sym);
        totalFractionalShares = 0.0;
        stockName = name;
    }

    public void purchase(double sharesBought, double totalPurchasePrice) {
        totalFractionalShares += sharesBought - (int) sharesBought;
        if (totalFractionalShares < 0 || totalFractionalShares >= 1) {
            throw new IllegalArgumentException();
        }
        addTotalNumShares(sharesBought);
        addTotalCost(totalPurchasePrice);
    }

    public int profitLoss(double currentPricePerShare) {
        storeProfitOrLoss((getTotalNumShares() * currentPricePerShare) - getTotalCost());
        return (int) Math.round(getProfitOrLoss());
    }

}