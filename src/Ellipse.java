public class Ellipse {
    // [UNDERSTAND] semiMajorAxis variable restricts access to other classes and methods
    private double semiMajorAxis;
    // [UNDERSTAND] semiMinorAxis variable restricts access to other classes and methods
    private double semiMinorAxis;

// [UNDERSTAND] Initialized the semiMajorAxis and semiMinorAxis in a constructor
    public Ellipse(){
        this.semiMajorAxis = 0.0;
        this.semiMinorAxis = 0.0;
    }

    // [DECISION] Used a constructor to build the ellipse and input the semiMajorAxis and semiMinorAxis as data to be used later
    public Ellipse(double semiMajorAxis, double semiMinorAxis){
        setsemiMajorAxis(semiMajorAxis);
        setsemiMinorAxis(semiMinorAxis);
    }
// [UNDERSTAND] Getter method for semiMajorAxis
    public double getsemiMajorAxis(){
        return semiMajorAxis;
    }

// [UNDERSTAND] Getter method for semiMinorAxis
    public double getsemiMinorAxis(){
        return semiMinorAxis;
    }

// [UNDERSTAND] Setter method for semiMajorAxis
    public void setsemiMajorAxis(double semiMajorAxis){
        // [DECISION] Used an if-else statement to prevent the semiMajorAxis input to be negative
        if(semiMajorAxis>=0){
            this.semiMajorAxis = semiMajorAxis;
        }
        else{
            System.out.println("This is invalid! There should be no negative numbers!");
        }
    }
// [UNDERSTAND] Setter method for semiMinorAxis
    public void setsemiMinorAxis(double semiMinorAxis){
        // [DECISION] Used an if-else statement to prevent the semiMinorAxis input to be negative
        if(semiMinorAxis>=0){
            this.semiMinorAxis = semiMinorAxis;
        }
        else{
            System.out.println("This is invalid! There should be no negative numbers!");
        }
    }
// [UNDERSTAND] Method to calculate the area of the ellipse
    public double calculateArea(){
        // [UNDERSTAND] Declared the 'a' or area variable as double
        double a;
        // [UNDERSTAND] Set the formula for the area of the ellipse
        a = Math.PI*semiMajorAxis*semiMinorAxis;
        // [UNDERSTAND] Returned a double value
        return a;
    }

    // [UNDERSTAND] Method to calculate the perimeter of the ellipse
    public double calculatePerimeter(){
        // [UNDERSTAND] Declared the 'p' or perimeter variable as double
        double p;
        // [UNDERSTAND] Declared the 'h' value as the formula shown
        double h = ((semiMajorAxis-semiMinorAxis)*(semiMajorAxis-semiMinorAxis))/((semiMajorAxis+semiMinorAxis)*(semiMajorAxis+semiMinorAxis));
        // [UNDERSTAND] Set the formula for the perimeter of the ellipse
        p = Math.PI*(semiMajorAxis + semiMinorAxis)*((1.0+(3.0*h))/(10.0+Math.sqrt(4.0-3.0*h)));
        // [UNDERSTAND] Returned a double value
        return p;
    }

    public static void main(String[] args) {
        System.out.println("Testing Ellipse Class");
        Ellipse ellipse1 = new Ellipse(6, 7);
        System.out.println("Ellipse 1 created with semiMajorAxis: " + ellipse1.getsemiMajorAxis() + " and semiMinorAxis: " + ellipse1.getsemiMinorAxis());
        System.out.println("Calculated Area: " + ellipse1.calculateArea()); // Expected Area is 131.95
        System.out.println("Calculated Perimeter: " + ellipse1.calculatePerimeter()); //Expected Perimeter is 40.90

        System.out.println("Testing if negative inputs are prevented");
        Ellipse ellipse2 = new Ellipse(-1, -2);
        System.out.println("Ellipse 2 semiMajorAxis after checking: " + ellipse2.getsemiMajorAxis());
        System.out.println("Ellipse 2 semiMinorAxis after checking: " + ellipse2.getsemiMinorAxis());

        System.out.println("Testing is positive inputs are accepted");
        ellipse2.setsemiMajorAxis(2);
        System.out.println("Ellipse 2 semiMajorAxis after checking: " + ellipse2.getsemiMajorAxis());
        ellipse2.setsemiMinorAxis(3);
        System.out.println("Ellipse 2 semiMinorAxis after checking: " + ellipse2.getsemiMinorAxis());
        System.out.println("Calculated Area: " + ellipse2.calculateArea());
    }
}
