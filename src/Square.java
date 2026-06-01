public class Square {
    // [UNDERSTAND] Declared a side variable as double restricting the access to other classes and methods
    private double side;
    // [UNDERSTAND] Added to track whether the shape is solid or hollow
    private boolean filled;

// [UNDERSTAND] Initialized the side variable in a constructor
    public Square(){
        this.side = 0.0;
        // [UNDERSTAND] This is the default state
        this.filled = true;
    }
// [DECISION] Used a constructor to create square object and added the input side as data to be used later and default filled state
    public Square(double side){
        setSide(side);
        setFilled(true);
    }

    public Square(double side, boolean filled){
        setSide(side);
        setFilled(filled);
    }

    // [UNDERSTAND] Getter method for the filled state
    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

// [UNDERSTAND] Getter method for the side
    public double getSide(){
        return side;
    }

// [UNDERSTAND] Setter method for the side
    public void setSide(double side){
       // [UNDERSTAND] Used an if-else statement to prevent the inputted side from becoming negative
        if(side>=0){
            this.side = side;
        }
        else{
            System.out.println("Invalid! There should be no negative numbers!");
        }
    }
//[UNDERSTAND] Method to calculate the area for square
    public double calculateArea(){
        // [UNDERSTAND] Declared 'a' variable as area and double data type
        double a;
        // [UNDERSTAND] Set the formula for area of square
        a = side*side;
        // [UNDERSTAND] Returned a double value
        return a;
    }
//[UNDERSTAND] Method to calculate the perimeter for square
    public double calculatePerimeter(){
        // [UNDERSTAND] Declared 'p' as perimeter and double data type
        double p;
        // [UNDERSTAND] Set the formula for perimeter of a square
        p = 4.0*side;
        // [UNDERSTAND] Returned a double value
        return p;
    }

    // [UNDERSTAND] Prints an ASCII Art Square depending on the side value and filled state
    public void printShape(){
        // [UNDERSTAND] Converts the double side into an integer s to print our rows and columns
        int s = (int)Math.round(side);
        // [DECISION] Used an if-else statement to check if the double side was converted to a int 0
        if(s<=0){
            System.out.println("Cannot render an empty square");
            return;
        }

        // [UNDERSTAND] This initiates the outer loop, which manages the rows of the square
        for(int i = 0; i<s; i++){
            // [UNDERSTAND] This initiates the nested inner loop, which manages the columns within each row
            for(int j=0;j<s;j++){
                // [DECISION] Used an if-else statement to render the square, if none of the conditions are met then it is hollow
                if(filled || i==0 || i == s-1 || j==0 || j==s-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            // [UNDERSTAND] TO drop the cursor down to the next line
            System.out.println();
        }
    }

    public static void main(String[] args){
        System.out.println("Testing Square Output Format\n");

        // Creating a filled square with a side length of 5
        Square square1 = new Square(5.0, true);
        square1.printShape();

        System.out.println("\n-----------------------------------\n");

        // Creating a hollow square with a side length of 5
        Square square2 = new Square(5.0, false);
        square2.printShape();
    }


}
