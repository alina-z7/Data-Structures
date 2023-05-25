import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        Stack<Integer> s = new Stack<>();
        s.addAll(List.of(67, 29, 115, 84, 33, 71, 90));
        collectionMystery10(s, 5);
        Stack<Integer> stack = new Stack<>();
        stack.addAll(List.of(8,5,1,2,1,1,2,1,4,5));
        collectionMystery8(stack);
        collectionMystery1(new ArrayList<>(List.of(0,1,4,3,1,3)));
        collectionMystery4(new ArrayList<>(List.of(0,16,9,1,64,25,25,14,0)));
        mystery(new ArrayList<>(List.of(40, 20, 60, 1, 80, 30)));
        Stack<Integer> s = new Stack<>();
        mystery1( s);
        Queue<Integer> q = new LinkedList<>();
        q.addAll(List.of(30,20,10,60,50,40,3,0));
        collectionMystery3(q);


        Queue<Integer> queue = new LinkedList<>();
        queue.addAll(List.of(67,29,115, 84,33,71,90));
        collectionMystery9(queue, 50);


        Stack<Integer> s = new Stack<>();
        s.addAll(List.of(65,30,10,20,45,55,6,1));
        collectionMystery6(s);


        Queue<Integer> queue = new LinkedList<>();
        queue.addAll(List.of(80,20,65,10,5,3,40,2,11));
        collectionMystery7(queue);

         */
        ArrayList<String> list1 = new ArrayList<>(List.of("cat", "cat", "long", "long", "longcat"));
        ArrayList<String> list2 = new ArrayList<>(List.of("mew", "purr", "cat", "cat", "purr"));
        collectionMystery5(list1, list2);
    }

    public static void collectionMystery1(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            list.remove(i);
            if (n % 2 == 0) {
                list.add(i);
            }
        }
        System.out.println(list);
    }

    public static void collectionMystery4(ArrayList<Integer> v) {
        for (int i = 1; i < v.size(); i += 2) {
            if (v.get(i - 1) >= v.get(i)) {
                v.remove(i);
                v.add(0, 0);
            }
        }
        System.out.println(v);
    }

    public static void mystery(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            if (n % 10 == 0) {
                list.remove(i);
                list.add(n);
            }
        }
        System.out.println(list);
    }

    public static void mystery1(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();
        while (!s.isEmpty()) {
            q.add(s.peek());
            q.add(s.pop());
        }
        while (!q.isEmpty()) {
            s.add(q.peek());
            q.remove();
        }
        System.out.println(s);
    }

    public static void collectionMystery10(Stack<Integer> stack, int n) {
        Stack<Integer> stack2 = new Stack<>();
        Queue<Integer> queue = new LinkedList<Integer>();

        while (stack.size() > n) {
            queue.add(stack.pop());
        }
        while (!stack.isEmpty()) {
            int element = stack.pop();
            stack2.push(element);
            if (element % 2 == 0) {
                queue.add(element);
            }
        }
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack2.isEmpty()) {
            stack.push(stack2.pop());
        }
        System.out.println(stack);
    }

    public static void collectionMystery8(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<Integer>();
        TreeSet<Integer> set = new TreeSet<Integer>();

        while (!stack.isEmpty()) {
            if (stack.peek() % 2 == 0) {
                queue.add(stack.pop());
            } else {
                set.add(stack.pop());
            }
        }
        for (int n : set) {
            stack.push(n);
        }
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        System.out.println(stack);
    }

    public static void collectionMystery3(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        int size = q.size();
        for (int i = 0; i < size; i++) {
            int n = q.remove();
            if (n % 2 == 0) {
                s.push(n);
            } else {
                q.add(n);
            }
        }
            System.out.println("q=" + q);
            System.out.println("s=" + s);

    }

    public static void collectionMystery9(Queue<Integer> queue, int p) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            int element = queue.remove();
            if (element < p) {
                queue.add(element);
            } else {
                count++;
                stack.push(count);
                stack.push(element);
            }
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        System.out.println(queue);

    }

    public static void collectionMystery6(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s2 = new Stack<>();

        while (!s.isEmpty()) {
            if (s.peek() %2 == 0) {
                q.add(s.pop());
            } else {
                s2.push(s.pop());
            }
        }
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s2.isEmpty()) {
            s.push(s2.pop());
        }
        System.out.println(s);
    }

    public static void collectionMystery7(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        int qsize = q.size();
        for  (int i = 0; i < qsize; i++) {
            if (q.peek() % 2 == 0) {
                q.add(q.remove());
            } else {
                stack.push(q.peek());
                stack.push(q.remove());
            }
        }
        while (!q.isEmpty()) {
            stack.push(q.remove());
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " ");
        }
        
    }

    public static void collectionMystery5(ArrayList<String> list1, ArrayList<String> list2) {
        HashMap<String, String> result = new HashMap<>();

        for (int i = 0; i < list1.size(); i++) {
            String s1 = list1.get(i);
            String s2 = list2.get(i);

            if (!result.containsKey(s1)) {
                result.put(s1,s2);
            } else if (!result.containsKey(s2)) {
                result.put(s2, s1);
            } else {
                result.put(s1 + s2, s1);
            }

        }
        System.out.println(result);
    }

}