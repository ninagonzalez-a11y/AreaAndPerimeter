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

    public static void main(String[] args){
        System.out.println("Testing Circle Class");
        Circle circle1 = new Circle(5.0);
        System.out.println("Circle 1 created with radius" +circle1.getRadius());
        System.out.println("Calculated Area: " + circle1.calculateArea()); // Expected Area is 78.54
        System.out.println("Calculated Perimeter: " + circle1.calculatePerimeter()); //Expected Perimeter is 31.43

        System.out.println("Testing if negative inputs are prevented");
        Circle circle2 = new Circle(-3.5);
        System.out.println("Circle 2 radius after checking: " + circle2.getRadius());

        System.out.println("Testing is positive inputs are accepted");
        circle2.setRadius(4.0);
        System.out.println("Circle 2 radius after checking: " +circle2.getRadius());
        System.out.println("Calculated Area: " + circle2.calculateArea());
    }

}
