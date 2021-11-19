package Class19;

public class Employee {
    String name;
    int age;
    int salary = 50000;
    int baseNoDaysOff = 20;

    void printSalary () {

        System.out.println(salary);
    }
    void printNoDaysOff () {
        System.out.println(baseNoDaysOff);

    }
} class Manager extends Employee {
    int salary = 70000;
    int bonus=10;
    int travelingAllowance=200;
    void printSalary () {
        super.printSalary();
        System.out.println(bonus+travelingAllowance+super.salary);
        //super.to use the variable from the parent class
        //if we will not use the super. we will use the child's variable
    }
}
