public class Ellipse {
    // [UNDERSTAND] semiMajorAxis variable restricts access to other classes and methods
    private double semiMajorAxis;
    // [UNDERSTAND] semiMinorAxis variable restricts access to other classes and methods
    private double semiMinorAxis;

// [UNDERSTAND] Initialized the semiMajorAxis and semiMinorAxis as a constructor
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
// [UNDERSTAND] Method to calculate the area of the square
    public double calculateArea(){
        // [UNDERSTAND] Declared the 'a' or area variable as double
        double a;
        // [UNDERSTAND] Set the formula for the area of the square
        a = Math.PI*semiMajorAxis*semiMinorAxis;
        // [UNDERSTAND] Returned a double value
        return a;
    }

    // [UNDERSTAND] Method to calculate the perimeter of the square
    public double calculatePerimeter(){
        // [UNDERSTAND] Declared the 'p' or perimeter variable as double
        double p;
        // [UNDERSTAND] Declared the 'h' value as the formula shown
        double h = ((semiMajorAxis-semiMinorAxis)*(semiMajorAxis-semiMinorAxis))/((semiMajorAxis+semiMinorAxis)*(semiMajorAxis+semiMinorAxis));
        // [UNDERSTAND] Set the formula for the perimeter of the square
        p = Math.PI*(semiMajorAxis + semiMinorAxis)*((1.0+(3.0*h))/(10.0+Math.sqrt(4.0-3.0*h)));
        // [UNDERSTAND] Returned a double value
        return p;
    }
}
