import java.util.Scanner;

public class AreaCalculator {
    private static float pi = 3.142f;

    private static float circle(float radius) {		
        return (pi * radius * radius);
    }

    private static float square(float length) {
        return length * length;
    }

    private static float rectangle(float length, float breadth) {
        return length * breadth;
    }
/*circle - You will need the radius of the circle to calculate the area. 
The area can be calculated using the formula (pi.r^2) where r is the radius that needs to be provided as a parameter to the function.

square - You will need the length or breadth of the square to calculate the area. 
The area can be calculated using the formula (length.length) or (breadth.breadth). In the case of a square, both are the same and that needs to be provided as a parameter to the function.

rectangle - You will need the the length and breadth of the rectangle to calculate the area.
 The area can be calculated using the formula (length.breadth). Both length and breadth need to be provided as parameters to the function. */

 /*the methods are private, meaning that the method can only be called within the class, 
 and static, meaning you don't have to create an instance of the class to invoke the method and 
 all the methods return a float, meaning the return value can have decimal place. */

    public static void main(String s[]) {
        System.out.println("Welcome to the area calculator!");
        while(true) {
            System.out.println("\nEnter 1 for circle\n" +
                              "Enter 2 for square\n" +
                              "Enter 3 for rectangle");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                System.out.println("Enter the radius of the circle");
                float radius = Float.parseFloat(scanner.nextLine());
                System.out.println("The area of circle of radius "+ radius + "is " + circle(radius));
            } else if (choice == 2) {
                System.out.println("Enter the length of the square");
                float length = Float.parseFloat(scanner.nextLine());
                System.out.println("The area of square of side length "+ length + " is " + square(length));
            } else if (choice == 3) {
                System.out.println("Enter the length of the rectangle");
                float length = Float.parseFloat(scanner.nextLine());
                System.out.println("Enter the breadth of the rectangle");
                float breadth = Float.parseFloat(scanner.nextLine());
                System.out.println("The area of rectangle of length "+ length + 
                                    "and breadth "+breadth+ " is " + rectangle(length,breadth));
            } else {
                System.out.println("Invalid choice");
                break;

                /*A Scanner object is used to read user input from the console. 
                The user's input is converted into an integer using Integer.parseInt().

If the user enters 1 for circle, the user is asked to input the circle's radius. 
The radius that is input as string is converted into a float using Float.parseFloat(). 
The circle method is called, and its result is displayed.

If the user enters 2 for square, the user is asked to input the square's side length. 
The length that is input as string is converted into a float using Float.parseFloat(). 
The square method is called, and its result is displayed.

If the user enters 3 for rectangle, the user is asked to input the rectangle's length and breadth. 
The rectangle method is called, and its result is displayed. */

            }
        }
    }
}