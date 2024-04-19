package lists;
import java.util.LinkedList;
import java.util.List;
public class TowersOfHanoi { //game class called towers of hanoi
    private LinkedList<Move> listOfMoves; //list of moves
    int numberOfMoves; //number of moves

    public TowersOfHanoi() {  //@param - n
        listOfMoves = new LinkedList<>();
        numberOfMoves = 1;
    }

    public List<Move> solve2() {
       return new LinkedList<>();
    }

    public List solve(int n, Peg source, Peg aux, Peg target) {
        if (n == 1) {
            //move the disk from source to target
            source.getStackOfDisks().pop();
            listOfMoves.add(new Move(numberOfMoves, source.getStackOfDisks().peek(), source, target, aux));
            target.getStackOfDisks().push(n);
            numberOfMoves++;

        } else {
            listOfMoves.addAll(solve(n - 1, source, aux, target));
            listOfMoves.addAll(solve(1, source, target, aux));
            listOfMoves.addAll(solve(n - 1, aux, target, source));
        }

       return listOfMoves;
    }

}
