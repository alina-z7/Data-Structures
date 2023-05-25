public class TowersOfHanoiTester {

    public static void main(String[] args) {
        TowersOfHanoi round1 = new TowersOfHanoi();
        System.out.println(round1.solve(3, new Peg(3), new Peg(0), new Peg(0)));
        TowersOfHanoi round2 = new TowersOfHanoi();
        System.out.println(round2.solve(6, new Peg(6), new Peg(0), new Peg(0)));
    }


}
