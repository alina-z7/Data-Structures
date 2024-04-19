public class EquityTester {
    public static void main(String[] args) {

        DividendStock att = new DividendStock("T", "AT&T");
        Stock bell = new Stock("B");
        Stock compaq = new Stock("C");
        DividendStock dell = new DividendStock("D", 75.00);
        MutualFund babson = new MutualFund("BABS", "Babson Fund");
        MutualFund vanguard = new MutualFund("VANG", "Vanguard");

        att.purchase(100, 12, 2.97);
        bell.purchase(10, 19.25, 0);
        compaq.purchase(95, 8.88, 12.00);
        dell.purchase(1, 1234.00, 1);
        babson.purchase(27.175, 1000.00);
        vanguard.purchase(19.072, 1000.00);
        att.purchase(50, 14, 3.95);
        dell.purchase(1, 1400.50, 1);
        vanguard.purchase(20.927, 1000.00);

        att.payDiv(1.35);
        att.payDiv(1.44);
        dell.payDiv(55.55);

        //TO DO #1
        att.profitLoss(15.50);
        bell.profitLoss(18.25);
        compaq.profitLoss(12.00);
        dell.profitLoss(1501.00);
        babson.profitLoss(26.95);
        vanguard.profitLoss(21.007);

        //TO DO #2
        Equity[] stockMarket = {att, babson, bell, compaq, dell, vanguard};
        for (Equity stocks : stockMarket) {
            System.out.println(stocks);
        }
    }
}