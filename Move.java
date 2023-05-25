public class Move {
    Peg source;
    Peg target;
    int n;
    public Move(int n, int numberOfMoves, Peg source, Peg target) {
        this.n = n;
        this.source = source;
        this.target = target;
    }

    public Move(int n, int numberOfMoves, Peg source, Peg aux, Peg target) {

    }

}
