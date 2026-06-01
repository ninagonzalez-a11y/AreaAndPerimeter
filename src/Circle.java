public class Circle {
    // [UNDERSTAND] Radius variable restricts access to other classes
    private double radius;

    // [UNDERSTAND] Initialized the radius variables
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

    public double calculateArea() {
        // [UNDERSTAND] Declared the 'a' variable for area
        double a;
        // [UNDERSTAND] Set the formula for the area of a circle
        a = Math.PI * radius * radius;
        // [UNDERSTAND] Returned a double value
        return a;
    }

    public double calculatePerimeter(){
        // [UNDERSTAND] Declared the 'p' variable
        double p;
        // [UNDERSTAND] Set the formula for the perimeter of a circle
        p = 2.0*Math.PI*radius;
        // [UNDERSTAND] Returned a double value
        return p;
    }

    }

