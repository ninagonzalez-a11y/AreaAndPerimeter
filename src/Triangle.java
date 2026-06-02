public class Triangle {
        // [UNDERSTAND] Declared a height variable as double restricting the access to other classes and methods
        private double height;
        // [UNDERSTAND] Added to track whether the shape is solid or hollow
        private boolean filled;

        // [UNDERSTAND] Initialized the height variable in a constructor
        public Triangle(){
            this.height = 0.0;
            // [UNDERSTAND] This is the default state
            this.filled = true;
        }

        // [DECISION] Used a constructor to create triangle object and added the input height as data to be used later and default filled state
        public Triangle(double height){
            setHeight(height);
            setFilled(true);
        }

        public Triangle(double height, boolean filled){
            setHeight(height);
            setFilled(filled);
        }

        // [UNDERSTAND] Getter method for the filled state
        public boolean isFilled(){
            return filled;
        }

        public void setFilled(boolean filled){
            this.filled = filled;
        }

        // [UNDERSTAND] Getter method for the height
        public double getHeight(){
            return height;
        }

        // [UNDERSTAND] Setter method for the height
        public void setHeight(double height){
            // [UNDERSTAND] Used an if-else statement to prevent the inputted height from becoming negative
            if(height >= 0){
                this.height = height;
            }
            else{
                System.out.println("Invalid! There should be no negative numbers!");
            }
        }

        // [UNDERSTAND] Method to calculate the area for a right-isosceles / symmetric block triangle
        public double calculateArea(){
            // [UNDERSTAND] Declared 'a' variable as area and double data type
            double a;
            // [UNDERSTAND] Set the formula for area of triangle (0.5 * base * height). Assuming base equals height for alignment.
            a = 0.5 * height * height;
            // [UNDERSTAND] Returned a double value
            return a;
        }

        // [UNDERSTAND] Method to calculate the perimeter for triangle
        public double calculatePerimeter(){
            // [UNDERSTAND] Declared 'p' as perimeter and double data type
            double p;
            // [UNDERSTAND] Uses Pythagorean theorem to find the hypotenuse if base and height are equal
            double hypotenuse = Math.sqrt((height * height) + (height * height));
            p = height + height + hypotenuse;
            // [UNDERSTAND] Returned a double value
            return p;
        }

        // [UNDERSTAND] Prints an ASCII Art Triangle depending on the height value and filled state
        public void printShape(){
            // [UNDERSTAND] Converts the double height into an integer h to print our rows and columns
            int h = (int)Math.round(height);
            // [DECISION] Used an if-else statement to check if the double height was converted to a int 0
            if(h <= 0){
                System.out.println("Cannot render an empty triangle");
                return;
            }

            // [UNDERSTAND] This initiates the outer loop, which manages the rows of the triangle
            for(int i = 0; i < h; i++){
                // [UNDERSTAND] This initiates the nested inner loop, which manages columns.
                // In a standard right-angle layout, the number of columns printed matches the current row index (j <= i).
                for(int j = 0; j <= i; j++){
                    // [DECISION] Determines to render a boundary asterisk or check filled status.
                    // A position gets an asterisk if the shape is solid (filled), if it is the bottom row (i == h - 1),
                    // if it is the left side column (j == 0), or the descending hypotenuse border (j == i).
                    if(filled || i == h - 1 || j == 0 || j == i){
                        System.out.print("* "); // FIXED: Kept 2-character unit spacing
                    }
                    else{
                        System.out.print("  "); // FIXED: Kept 2-character unit spacing
                    }
                }
                // [UNDERSTAND] To drop the cursor down to the next line
                System.out.println();
            }
        }

        public static void main(String[] args){
            System.out.println("Testing Triangle Output Format\n");

            // [TRACE] Creating a filled triangle with a height of 5
            System.out.println("Filled Triangle:");
            Triangle triangle1 = new Triangle(5.0, true);
            triangle1.printShape();

            System.out.println("\n-----------------------------------\n");

            // [TRACE] Creating a hollow triangle with a height of 5
            System.out.println("Hollow Triangle:");
            Triangle triangle2 = new Triangle(5.0, false);
            triangle2.printShape();
        }
    }

