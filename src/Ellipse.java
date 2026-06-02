public class Ellipse {
    // [UNDERSTAND] semiMajorAxis variable restricts access to other classes and methods
    private double semiMajorAxis;
    // [UNDERSTAND] semiMinorAxis variable restricts access to other classes and methods
    private double semiMinorAxis;
    private boolean filled;

// [UNDERSTAND] Initialized the semiMajorAxis and semiMinorAxis in a constructor
    public Ellipse(){
        this.semiMajorAxis = 0.0;
        this.semiMinorAxis = 0.0;
        this.filled = true;
    }

    // [DECISION] Used a constructor to build the ellipse and input the semiMajorAxis and semiMinorAxis as data to be used later
    public Ellipse(double semiMajorAxis, double semiMinorAxis){
        setsemiMajorAxis(semiMajorAxis);
        setsemiMinorAxis(semiMinorAxis);
        setFilled(true);
    }

    public Ellipse(double semiMajorAxis, double semiMinorAxis, boolean filled){
        setsemiMajorAxis(semiMajorAxis);
        setsemiMinorAxis(semiMinorAxis);
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
        p = Math.PI*(semiMajorAxis + semiMinorAxis)*(1.0 + (3.0 * h)/(10.0+Math.sqrt(4.0-3.0*h)));
        // [UNDERSTAND] Returned a double value
        return p;
    }

    public void printShape() {
        int a = (int) Math.round(semiMajorAxis);
        int b = (int) Math.round(semiMinorAxis);
        if (a <= 0 || b <= 0) {
            System.out.println("Cannot render empty ellipse");
            return;
        }
        for (int y = -b; y <= b; y++) {
            for (int x = -a; x <= a; x++) {
                double equationVal = (double) (x * x) / (a * a) + (double) (y * y) / (b * b);
                if (filled) {
                    if (equationVal <= 1.0) System.out.print("*");
                    else System.out.print(" ");
                } else {
                    // Check close proximity to the perimeter threshold boundary
                    if (equationVal >= 0.75 && equationVal <= 1.05) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Testing Ellipse Output Format\n");


        Ellipse ellipse1 = new Ellipse(5, 3, true);
        ellipse1.printShape();

        System.out.println("\n-----------------------------------\n");


        Ellipse ellipse2 = new Ellipse(5, 3, false);
        ellipse2.printShape();


    }
}
