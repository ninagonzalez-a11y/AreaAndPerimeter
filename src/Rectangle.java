public class Rectangle {
    // [UNDERSTAND] Set width as double and restricted access to other classes and methods
    private double width;
    // [UNDERSTAND] Set height as double and restricted access to other classes and methods
    private double height;
    // [UNDERSTAND] Added a filled state
    private boolean filled;

// [UNDERSTAND] Initialized the width, height and the boolean filled state to true
    public Rectangle(){
        this.width = 0.0;
        this.height = 0.0;
        this.filled = true;
    }
// [DECISION] Used a constructor to create a rectangle object with inputs of width and height to be used later and default filled state
    public Rectangle(double width, double height){
        setWidth(width);
        setHeight(height);
        setFilled(true);
    }

    public Rectangle(double width, double height, boolean filled){
        setWidth(width);
        setHeight(height);
        setFilled(filled);
    }

    // [UNDERSTAND] Getter method for filled state
    public boolean isFilled(){
        return filled;
    }

    // [UNDERSTAND] Setter method for the filled state
    public void setFilled(boolean filled){
        this.filled = filled;
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

    public void printShape(){
        // [TRACE] Converts the double width and height into int w and h
        int w = (int) Math.round(width);
        int h = (int) Math.round(height);

        // [DECISION] Used an if statement to prevent empty rectangles
        if(w<=0||h<=0){
            System.out.println("Cannot render an empty rectangle");
            return;
        }

        for(int i=0; i<h; i++){
            for(int j=0;j<w;j++){
                if(filled || i == 0 || i == h - 1 || j == 0 || j == w - 1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Testing Rectangle Output Format\n");

        Rectangle rectangle1 = new Rectangle(5, 3, true);
        rectangle1.printShape();

        System.out.println("\n-----------------------------------\n");

        Rectangle rectangle2 = new Rectangle(5, 3, false);
        rectangle2.printShape();
    }


}
