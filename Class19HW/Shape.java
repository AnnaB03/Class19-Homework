package Class19.Class19HW;

public class Shape {
    //Write program: Class19.Class19HW.Shape class has a constructor that takes the radius
    // and has a subclass as  Class19.Class19HW.circle class. In Class19.Class19HW.circle class create a method
    // to calculate the area of Class19.Class19HW.circle. Test your code

    double radius;
    Shape (double radius) {
        this.radius = radius;
    }
} class circle extends Shape{
    circle (double radius) {
        super(radius);

    } void calculation () {
        double area = radius*radius*Math.PI;
        System.out.println(area);

        }
    }
    class circleTester {
        public static void main(String[] args) {
            circle area1 = new circle(5.66);
            area1.calculation();
        }
    }






