import java.util.LinkedList;

public class ListNodeTester {
    public static void main(String[] args) {
        ListNode head = new ListNode('a');
        System.out.println(head);
        head.add('b');
        head.add('c');
        head.add('d');
        head.add('e');
        System.out.println(head);
        System.out.println("size of my list is " + head.size());
        head.add(1,'x');
        head.add(6, 'y');
        System.out.println(head);
        System.out.println("size of my list is " + head.size());

        /** The following methods were added to the ListNode class:
         * get(int index)
         * remove(int index)
         * isEmpty()
         */

        System.out.println(head.get(6));
        System.out.println(head.isEmpty());
        head.remove(3);
        System.out.println(head);
        head.remove(4);
        System.out.println(head);
    }
}
