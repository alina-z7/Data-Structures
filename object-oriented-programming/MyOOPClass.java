package oop;
public class MyOOPClass extends AnotherClass implements Comparable<MyOOPClass>  {
    private String name;
    public MyOOPClass(String n) {
        super(n);
        name = n;
    }

    @Override
    public int compareTo(MyOOPClass o) {
        return name.length() - o.getName().length();
    }

    @Override
    public boolean equals(Object o) {
        return toString() == o.toString();
    }
}
