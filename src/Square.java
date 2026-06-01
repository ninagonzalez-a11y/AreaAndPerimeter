public class Square {
    private double side;

// constructor #1
    public Square(){
        this.side = 0.0;
    }
// setter method as constructor #2
    public Square(double side){
        setSide(side);
    }

// getter method
    public double getSide(){
        return side;
    }

// setter method
    public void setSide(double side){
        if(side>=0){
            this.side = side;
        }
        else{
            System.out.println("Invalid! There should be no negative numbers!");
        }
    }

    public double calculateArea(){
        double a;
        a = side*side;
        return a;
    }

    public double calculatePerimeter(){
        double p;
        p = 4.0*side;
        return p;
    }

}
