public class Square {
    // [UNDERSTAND] Declared a side variable as double restricting the access to other classes and methods
    private double side;

// [UNDERSTAND] Initialized the side variable in a constructor
    public Square(){
        this.side = 0.0;
    }
// [DECISION] Used a constructor to create square object and added the input side as data to be used later
    public Square(double side){
        setSide(side);
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

}
