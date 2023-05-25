import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BigOh {
    /*
    RunTime Record:
    one doSomething = 20 ms
    three doSomething = 20 ms
    for loop in method1 = 20 ms
    for loop in for loop:
        - (p++) = p  * 20
        - m = 10, n = 2, p = 10 - 200 ms
        - m = 100, n = 1, p = 100 - 10,000 ms

     */

    public static void main(String[] args) {
        System.out.println("Hello Big-Oh");
        //System.out.printf("Approximate run time in ms: %,d\n", method1(10, 2, 10));
        //System.out.printf("Approximate run time in ms: %,d\n", method2(10, 2, 100));
       // System.out.printf("Approximate run time in ms: %,d\n", method3(50000, 2, 100));



    }

    public static long method1(int m, int n, int p) {
        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int k = 0; k < p; k++) {
                doSomething(m);
            }
        }
        endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long method2(int m, int n, int p) {
        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int k = 0; k < p; k++) {
                doSomething(m);
                l.add(i, i);
            }
        }
        endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long method3(int m, int n, int p) {
        long startTime;
        long endTime;
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.set(i, i);
        }
        Collections.sort(l);
        startTime = System.currentTimeMillis(); //for loop of get j
        endTime = System.currentTimeMillis();
        return endTime - startTime;
    }


    public static void doSomething(int n) {
        long startTime = System.currentTimeMillis();
        while(System.currentTimeMillis() - startTime < n) {
            //nothing
        }
    }
}
