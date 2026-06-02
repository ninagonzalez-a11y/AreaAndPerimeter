import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the 2D Shapes Calculator App!");

        int choice;

        do {
            System.out.println("====================================");
            System.out.println("     2D SHAPES CALCULATOR     ");
            System.out.println("====================================");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Ellipse");
            System.out.println("5. Triangle");
            System.out.println("6. Exit"); // Adjusted choices
            System.out.println("====================================");
            System.out.print("Enter your choice (1-6): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter side length for Square: ");
                    double side = scanner.nextDouble();
                    Square mySquare = new Square(side);
                    mySquare.printShape();
                    System.out.println("Area: " + mySquare.calculateArea());
                    System.out.println("Perimeter: " + mySquare.calculatePerimeter());
                    break;
                case 2:
                    System.out.print("Enter width of Rectangle: ");
                    double w = scanner.nextDouble();
                    System.out.print("Enter height of Rectangle: ");
                    double h = scanner.nextDouble();
                    Rectangle myRect = new Rectangle(w, h, true);
                    myRect.printShape();
                    System.out.println("Area: " + myRect.calculateArea());
                    System.out.println("Perimeter: " + myRect.calculatePerimeter());
                    break;
                case 3:
                    System.out.print("Enter radius of Circle: ");
                    double r = scanner.nextDouble();
                    Circle myCircle = new Circle(r, true);
                    myCircle.printShape();
                    System.out.println("Area: " +myCircle.calculateArea());
                    System.out.println("Perimeter: " +myCircle.calculatePerimeter());
                    break;
                case 4:
                    System.out.print("Enter semi-major axis: ");
                    double a = scanner.nextDouble();
                    System.out.print("Enter semi-minor axis: ");
                    double b = scanner.nextDouble();
                    Ellipse myEllipse = new Ellipse(a, b, true);
                    myEllipse.printShape();
                    System.out.println("Area: " +myEllipse.calculateArea());
                    System.out.println("Perimeter: " +myEllipse.calculatePerimeter());
                    break;

                case 5:
                    System.out.print("Enter height: ");
                    double c = scanner.nextDouble();
                    Triangle myTriangle = new Triangle(c, true);
                    myTriangle.printShape();
                    System.out.println("Area: " +myTriangle.calculateArea());
                    System.out.println("Perimeter: " + myTriangle.calculatePerimeter());
                    break;

                case 6:
                    System.out.println("Exiting App. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid selection! Please input 1-5.");
            }
            System.out.println();
        } while (choice != 6);

        scanner.close();
    }
}

