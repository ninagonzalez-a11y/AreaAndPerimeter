public class Rectangle {
    // [UNDERSTAND] Set width as double and restricted access to other classes and methods
    private double width;
    // [UNDERSTAND] Set height as double and restricted access to other classes and methods
    private double height;

// [UNDERSTAND] Initialized the width and height in a constructor
    public Rectangle(){
        this.width = 0.0;
        this.height = 0.0;
    }
// [DECISION] Used a constructor to create a rectangle object with inputs of width and height to be used later
    public Rectangle(double width, double height){
        setWidth(width);
        setHeight(height);
    }
// [UNDERSTAND] Getter method for width
    public double getWidth(){
        return width;
    }
// [UNDERSTAND] Getter method for height
    public double getHeight(){
        return height;
    }
// [UNDERSTAND] Setter method for width
    public void setWidth(double width){
        // [DECISION] Used an if-else statement to prevent the width input from becoming negative
        if(width>=0){
            this.width = width;
        }
        else{
            System.out.println("This is invalid! There must be no negative numbers!");
        }
    }
// [UNDERSTAND] Setter method for height
    public void setHeight(double height){
        // [DECISION] Used an if-else statement to prevent the width input from becoming negative
        if(height>=0){
            this.height = height;
        }
        else{
            System.out.println("This is invalid! There must be no negative numbers!");
        }
    }

    // [UNDERSTAND] Method to calculate the area of the rectangle
    public double calculateArea(){
        // [UNDERSTAND] Declared the 'a' variable as area of the rectangle
        double a;
        // [UNDERSTAND] Set the formula for the area of square
        a = height*width;
        // [UNDERSTAND] Returned a double value
        return a;
    }

    // [UNDERSTAND] Method to calculate the perimeter of the rectangle
    public double calculatePerimeter(){
        // [UNDERSTAND] Declared the 'p' variable as perimeter of the rectangle
        double p;
        // [UNDERSTAND] Set the formula for the perimeter of the rectangle
        p = 2.0*(height + width);
        // [UNDERSTAND] Returned a double value
        return p;
    }

    public static void main(String[] args){
        System.out.println("Testing Rectangle Class");
        // [TRACE] Creates a rectangle with a width of 2 and height 4
        Rectangle rectangle1 = new Rectangle(2, 4);
        // [UNDERSTAND] Tests to see if the correct width and height is displayed
        System.out.println("Rectangle 1 created with width and height: " + rectangle1.getWidth() + rectangle1.getHeight());
        System.out.println("Calculated Area: " + rectangle1.calculateArea()); // Expected Area is 8
        System.out.println("Calculated Perimeter: " + rectangle1.calculatePerimeter()); //Expected Perimeter is 12

        // [UNDERSTAND] Tests to see if negative width and height would be discarded
        System.out.println("Testing if negative inputs are prevented");
        // [TRACE] Creates a rectangle with negative width and height
        Rectangle rectangle2 = new Rectangle(-2, -3);
        // [UNDERSTAND] Displays the rectangle 2 width after going through the if-else statement
        System.out.println("Rectangle 2 width after checking: " + rectangle2.getWidth());
        // [UNDERSTAND] Displays the rectangle 2 height after going through the if-else statement
        System.out.println("Rectangle 2 height after checking" + rectangle2.getHeight());

        // [UNDERSTAND] Tests to see if positive inputs are applied correctly
        System.out.println("Testing is positive inputs are accepted");
        // [TRACE] Created a rectangle with width 1
        rectangle2.setWidth(1);
        // [UNDERSTAND] Checks if the proper width is displayed
        System.out.println("Rectangle 2 width after checking: " + rectangle2.getWidth());
        // [TRACE] Created a rectangle with a height of 2
        rectangle2.setHeight(2);
        // [UNDERSTAND] Checks if the proper height is displayed
        System.out.println("Rectangle 2 height after checking: " + rectangle2.getHeight());
        // [UNDERSTAND] Calculates the area of rectangle 2 through concatenation
        System.out.println("Calculated Area: " + rectangle2.calculateArea());
        }
}
