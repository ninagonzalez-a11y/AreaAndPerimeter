public class Circle {
    private double radius;

    public Circle(){
        this.radius = 0.0;
    }

    public Circle(double radius){
        setRadius(radius);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        if(radius>=0){
            this.radius = radius;
        }
        else{
            System.out.println("This is invalid! There should be no negative numbers!");
        }

        }

    public double calculateArea() {
        double a;
        a = Math.PI * radius * radius;
        return a;
    }

    public double calculatePerimeter(){
        double p;
        p = 2.0*Math.PI*radius;
        return p;
    }

    }

