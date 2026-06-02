public class Circle {
    // [UNDERSTAND] Radius variable restricts access to other classes and methods
    private double radius;
    private boolean filled;

    // [UNDERSTAND] Initialized the radius variables in a constructor
    public Circle(){
        this.radius = 0.0;
        this.filled = true;
    }

    // [DECISION] Used a constructor to create the circle object and input the radius as data to be used later
    public Circle(double radius){
        setRadius(radius);
        setFilled(true);
    }

    public Circle(double radius, boolean filled){
        setRadius(radius);
        setFilled(filled);
    }

    // [UNDERSTAND] Getter method for filled state
    public boolean isFilled(){
        return filled;
    }

    // [UNDERSTAND] Setter method for filled state
    public void setFilled(boolean filled){
        this.filled = filled;
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

    public void printShape() {
        int r = (int) Math.round(radius);

        if (r <= 0) {
            System.out.println("Cannot render an empty circle");
            return;
        }

        // [UNDERSTAND] Loops through a square bounding box grid from -r to +r
        for (int i = -r; i <= r; i++) {
            for (int j = -r; j <= r; j++) {
                // [UNDERSTAND] Uses Pythagorean distance: x^2 + y^2
                double distanceSq = (i * i) + (j * j);
                double radiusSq = r * r;

                // [DECISION] Determines whether to render an asterisk based on 'filled' state
                if (filled) {
                    // Check if current position is inside the circle boundary
                    if (distanceSq <= radiusSq + 0.5) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    // Approximate the thin outer ring outline edge of the circle
                    if (distanceSq >= radiusSq - r && distanceSq <= radiusSq + r) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Testing Circle Output Format\n");

        // Testing a filled circle with a radius of 5
        Circle circle1 = new Circle(5, true);
        circle1.printShape();

        System.out.println("\n-----------------------------------\n");

        // Testing a hollow circle with a radius of 5
        Circle circle2 = new Circle(5, false);
        circle2.printShape();
    }

    }



