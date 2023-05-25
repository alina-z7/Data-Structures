import java.util.*;
public class SetsAndMaps {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>();
        listA.add(10);
        listA.add(20);
        listA.add(30);
        listA.add(40);
        listA.add(10);

        Set<String> setA = new TreeSet<>();
        setA.add("Value1");
        setA.add("Value2");
        setA.add("Value3");

        Set<String> setB = new TreeSet<>();
        setB.add("Value2");
        setB.add("Value3");
        setB.add("Value4");

        Scanner test1 = new Scanner("this method should return five");
        System.out.println("Unique words = " + countWords(test1));
        System.out.println();
        System.out.println("Number of elements in the union set = " + totalElements(setA, setB));
        System.out.println("Has duplicates? = " + hasDuplicates(listA));
        Scanner test2 = new Scanner("this is a test this is a test");
        System.out.println("Unique words = " + countWords(test2));

        Scanner test3 = new Scanner("this is a test this is some text this");
        Map<String, Integer> wordCountMap = getCountMap(test3);
        for (String word : wordCountMap.keySet()) {
            int count = wordCountMap.get(word);
            System.out.println(word + " occurs " + count + " time(s).");
        }
    }

    // A. [totalElements] Return the number of elements contained in both sets passed as parameters.
    public static int totalElements(Set<String> setA, Set<String> setB) {
        Set<String> union = new HashSet<>(setA);
        union.addAll(setB);
        return union.size();
    }

    // B. [hasDuplicates]Identify if a list contains any duplicate elements
    public static boolean hasDuplicates(List<Integer> listA) {
        Set<Integer> set = new HashSet<>(listA);
        return listA.size() > set.size();
    }

    // C. [countWords] Count unique words
    public static int countWords(Scanner input) {
        Set<String> wordMap = new HashSet<>();
        while (input.hasNext()) {
            String word = input.next();
            wordMap.add(word);
        }
        return wordMap.size();
    }

    // D. [getCountMap] Returns a map from words to counts
    public static Map<String, Integer> getCountMap(Scanner input) {
        Map<String, Integer> wordCountMap = new TreeMap<>();
        while (input.hasNext()) {
            String word = input.next();
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        return wordCountMap;
    }

}
