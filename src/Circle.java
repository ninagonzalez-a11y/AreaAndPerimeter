public class Circle {
    // [UNDERSTAND] Radius variable restricts access to other classes and methods
    private double radius;

    // [UNDERSTAND] Initialized the radius variables in a constructor
    public Circle(){
        this.radius = 0.0;
    }

    // [DECISION] Used a constructor to create the circle object and input the radius as data to be used later
    public Circle(double radius){
        setRadius(radius);
    }

    // [UNDERSTAND] This is the getter method
    public double getRadius(){
        return radius;
    }
    // [UNDERSTAND] This is the setter method
    public void setRadius(double radius){
        // [DECISION] Used if-else statement to prevent negative radius inputs
        if(radius>=0){
            this.radius = radius;
        }
        else{
            System.out.println("This is invalid! There should be no negative numbers!");
        }

        }

// [UNDERSTAND] Method to calculate the area of the circle
    public double calculateArea() {
        // [UNDERSTAND] Declared the 'a' variable for area
        double a;
        // [UNDERSTAND] Set the formula for the area of a circle
        a = Math.PI * radius * radius;
        // [UNDERSTAND] Returned a double value
        return a;
    }
// [UNDERSTAND] Method to calculate the perimeter of the circle
    public double calculatePerimeter(){
        // [UNDERSTAND] Declared the 'p' variable
        double p;
        // [UNDERSTAND] Set the formula for the perimeter of a circle
        p = 2.0*Math.PI*radius;
        // [UNDERSTAND] Returned a double value
        return p;
    }

    public static void main(String[] args) {
        System.out.println("Testing Circle Class");
        Circle circle1 = new Circle(3);
        System.out.println("Circle 1 created with radius: " + circle1.getRadius());
        System.out.println("Calculated Area: " + circle1.calculateArea()); // Expected Area is 28.27
        System.out.println("Calculated Perimeter: " + circle1.calculatePerimeter()); //Expected Perimeter is 18.85

        System.out.println("Testing if negative inputs are prevented");
        Circle circle2 = new Circle(-5);
        System.out.println("Circle 2 radius after checking: " + circle2.getRadius());

        System.out.println("Testing is positive inputs are accepted");
        circle1.setRadius(1);
        System.out.println("Circle 2 radius after checking: " + circle2.getRadius());
        System.out.println("Calculated Area: " + circle2.calculateArea());
    }

    }

