package oop;
import java.util.*;

public class MyOOPClassTester {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<MyOOPClass> myObjects = new ArrayList<>();
        myObjects.add(new MyOOPClass("Laura"));
        myObjects.add(new MyOOPClass("Joe"));
        myObjects.add(new MyOOPClass("Mack"));
        myObjects.add(new MyOOPClass("Shelly"));

        System.out.println("Before sorted: " + myObjects); // sorting content
        Collections.sort(myObjects);
        System.out.println("After sorted: " + myObjects);

        System.out.println(myObjects.get(0)); // accessible content

        List<MyOOPClass> myObjects2 = new ArrayList<>();
        Iterator<MyOOPClass> itr = myObjects2.iterator();

        MyOOPClass susan = new MyOOPClass("Susan");
        MyOOPClass amanda = new MyOOPClass("Amanda");
        MyOOPClass chris = new MyOOPClass("Chris");
        myObjects2.add(susan);
        myObjects2.add(chris);
        myObjects2.add(amanda);

        System.out.print("\nInsert MyOOPClass object name: ");
        String name = console.next();
        MyOOPClass given = new MyOOPClass(name);



    }
}
