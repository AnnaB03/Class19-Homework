package Class19;

public class Task1 {
//    Write program for multilevel inheritance where class where class C inherits from class B and
    // class C inherits from Class A/
public static void main(String[] args) {
    C b = new C();
}
}
       class A {
           public A() {
               System.out.println("A");

           }
       }
class B extends Task2.A {
    public B () {
        System.out.println("B"); }
}

class C extends Task2.B {
    public C () {
        System.out.println("C"); }


    }
