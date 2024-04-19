public class ABCD_Main {
    public static void main(String[] args) {
        A[] elements = {new A(), new B(), new C(), new D()};

        for (A element : elements) {
            System.out.println(element);
            element.method1();
            element.method2();
            System.out.println();
        }
    }

}
/*
  Output predicted, polymorphism:

  When i = 0, class A will start
  A.toString() prints "A"
  A.method1() prints "A 1"
  A.method2() prints "A 2"

  When i = 1, class B
  No toString from B, A.toString
  B.method2() prints "B 2"
  No method1 from B, A.method1

  When i = 2, class C
  C.toString() prints "C"
  C.method1() prints "C 1"
  No method2 from C, A.method 2

  When i = 3, class D (extends C)
  No toString from D, C.toString
  No method1 from D, C.method1
  D.method2() prints "D 2"

 */