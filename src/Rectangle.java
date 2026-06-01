public class Rectangle {
    // [UNDERSTAND] Set width as double and restricted access to other classes and methods
    private double width;
    // [UNDERSTAND] Set height as double and restricted access to other classes and methods
    private double height;

// [UNDERSTAND] Initialized the width and height as constructors
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
}
