import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.currentTimeMillis;

public class Alternate {

    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>(List.of(1,2,3,4,5,6,7,8,9,10,11));
        List<Integer> list2 = new LinkedList<>(List.of(11,10,9,8,7,6,5,4,3,2,1));
        long startTime = currentTimeMillis();
        System.out.println(alternate(list1, list2));
        long endTime = currentTimeMillis();
        System.out.println("Approximate run time in ms: " + (endTime - startTime));
        System.out.println("Now with some real-world list lengths...");
        List<Integer> list3 = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list3.add(i);
        }
        List<Integer> list4 = new LinkedList<>();
        for (int l = 0; l <10000; l++) {
            list4.add(l);
        }
        long startTime1 = currentTimeMillis();
        System.out.println(alternate(list3, list4));
        long endTime1 = currentTimeMillis();
        System.out.println("Approximate run time in ms: " + (endTime1 - startTime1));

    }
    public static List alternate(List<Integer> list1, List<Integer> list2) {
        /* Define two list iterators that iterate
         * through each list (See textbook). Most helpful than for loop.
         * Then establish awhile loop that checks whether
         * the iterator has an element ready for the new list
         * to store; new linked list variable. Then the newList
         * will add the next element taken from the iterator.*/

        Iterator<Integer> itr1 = list1.iterator();  //iterator 1 - list 1
        Iterator<Integer> itr2 = list2.iterator();  //iterator 2 - list 2
        List<Integer> newList = new LinkedList<>(); //@return - newList

        while (itr1.hasNext() || itr2.hasNext()) {  //while iterator 1 or 2 are continuous
                                                    //if 1 is continuous, add its element
            if (itr1.hasNext()) {                   //to newList. Else if 2 is continuous
                newList.add(itr1.next());           //add its element to newList
            }

            if (itr2.hasNext()) {
                newList.add(itr2.next());
            }
        }
        return newList;
    }

}
