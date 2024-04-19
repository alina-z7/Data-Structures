package lists;
import java.util.Stack;

public class Peg {
    private final Stack<Integer> stackOfDisks;
    public Peg(int n) {
        stackOfDisks = new Stack<>();
        for (int i = n; n > 0; n--) {
            stackOfDisks.push(i);
        }
    }
    public Stack<Integer> getStackOfDisks() {
        return stackOfDisks;
    }


}
