import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the 2D Shapes Calculator App!");

        int choice; // FIXED: Declared outside the loop so 'while' can see it

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
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt(); // FIXED: Removed 'int' keyword here

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
                    break;
                case 3:
                    System.out.print("Enter radius of Circle: ");
                    double r = scanner.nextDouble();
                    Circle myCircle = new Circle(r, true);
                    myCircle.printShape();
                    break;
                case 4:
                    System.out.print("Enter semi-major axis: ");
                    double a = scanner.nextDouble();
                    System.out.print("Enter semi-minor axis: ");
                    double b = scanner.nextDouble();
                    Ellipse myEllipse = new Ellipse(a, b, true);
                    myEllipse.printShape();
                    break;

                case 5:

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

