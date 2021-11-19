package Class19;

public class Task2 {
    //Write program to inherit class A that has
            //method printF which is static and call or reuse that method into class B
    public static void main(String[] args) {
        B.printF();
    }

    static class A {
        static void printF () {
            System.out.println ("printF from A");
        }
    }

    static class B extends A {

            }
}

