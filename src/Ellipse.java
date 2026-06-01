public class Ellipse {
    private double semiMajorAxis;
    private double semiMinorAxis;

    public Ellipse(){
        this.semiMajorAxis = 0.0;
        this.semiMinorAxis = 0.0;
    }

    public Ellipse(double semiMajorAxis, double semiMinorAxis){
        setsemiMajorAxis(semiMajorAxis);
        setsemiMinorAxis(semiMinorAxis);
    }

    public double getsemiMajorAxis(){
        return semiMajorAxis;
    }

    public double getsemiMinorAxis(){
        return semiMinorAxis;
    }

    public void setsemiMajorAxis(double semiMajorAxis){
        if(semiMajorAxis>=0){
            this.semiMajorAxis = semiMajorAxis;
        }
        else{
            System.out.println("This is invalid! There should be no negative numbers!");
        }
    }

    public void setsemiMinorAxis(double semiMinorAxis){
        if(semiMinorAxis>=0){
            this.semiMinorAxis = semiMinorAxis;
        }
        else{
            System.out.println("This is invalid! There should be no negative numbers!");
        }
    }

    public double calculateArea(){
        double a;
        a = Math.PI*semiMajorAxis*semiMinorAxis;
        return a;
    }

    public double calculatePerimeter(){
        double p;
        double h = ((semiMajorAxis-semiMinorAxis)*(semiMajorAxis-semiMinorAxis))/((semiMajorAxis+semiMinorAxis)*(semiMajorAxis+semiMinorAxis));
        p = Math.PI*(semiMajorAxis + semiMinorAxis)*((1.0+(3.0*h))/(10.0+Math.sqrt(4.0-3.0*h)));
        return p;
    }
}
