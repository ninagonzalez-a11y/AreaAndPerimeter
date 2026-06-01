public class Rectangle {
    private double width;
    private double height;

// constructor #1 to initialize width and height
    public Rectangle(){
        this.width = 0.0;
        this.height = 0.0;
    }
// constructor #2 to set width and height (setter method)
    public Rectangle(double width, double height){
        setWidth(width);
        setHeight(height);
    }
// getter method for width
    public double getWidth(){
        return width;
    }
// getter method for height
    public double getHeight(){
        return height;
    }
// setter method for width
    public void setWidth(double width){
        if(width>=0){
            this.width = width;
        }
        else{
            System.out.println("This is invalid! There must be no negative numbers!");
        }
    }
// setter method for height
    public void setHeight(double height){
        if(height>=0){
            this.height = height;
        }
        else{
            System.out.println("This is invalid! There must be no negative numbers!");
        }
    }

    public double calculateArea(){
        double a;
        a = height*width;
        return a;
    }

    public double calculatePerimeter(){
        double p;
        p = 2.0*(height + width);
        return p;
    }
}
