import java.util.Scanner;

public class ExceptionTrial {
    public static void main(String s[]) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Initialize an array to store up to 5 strings
        String strArr[] = new String[5];

        // Variable to track the current index for adding strings
        int strIdx = 0;

        // Infinite loop to keep the program running until the user chooses to exit
        while (true) {
            // Display the menu options to the user
            System.out.println(
                "Press 1 to add String, " +
                "\n2 to get String from a particular index, " +
                "\n3 to get the length string in any index, " +
                "\n4 to get all the strings in the array " +
                "\nany other key to exit");

            // Read the user's choice
            String userAction = scanner.nextLine();

            // Option 1: Add a string to the array
            if (userAction.equals("1")) {
                // Check if the array is already full
                if (strIdx == 5) {
                    System.out.println("There are already 5 strings in the array!");
                } else {
                    // Prompt the user to enter a string
                    System.out.println("Enter the String ");
                    String inputStr = scanner.nextLine();

                    // Add the string to the array and increment the index
                    strArr[strIdx++] = inputStr;
                }
            }

            // Option 2: Retrieve a string from a specific index
            else if (userAction.equals("2")) {
                // Prompt the user to enter the index
                System.out.println("Enter the index you want to retrieve ");
                int retIdx = Integer.parseInt(scanner.nextLine());

                // Retrieve and print the string at the specified index
                System.out.println(strArr[retIdx]);
            }

            // Option 3: Get the length of a string at a specific index
            else if (userAction.equals("3")) {
                // Prompt the user to enter the index
                System.out.println("Enter the index you check the length of ");
                int retIdx = Integer.parseInt(scanner.nextLine());

                // Retrieve the string at the specified index and print its length
                System.out.println(strArr[retIdx].length());
            }

            // Option 4: Get all the strings in the array
            else if (userAction.equals("4")) {
                for (int i=0; i<5; i++) {
                    System.out.println(strArr[i]);
                }
            }
            // Exit the program if the user enters any other key
            else {
                break;
            }
        }
    }
}


/*The program is interactive and allows the user to perform operations on an array of strings. 
It demonstrates basic input/output, array manipulation, and control flow.

This program allows the user to:

    Add strings to an array.
    Retrieve a string from a specific index in the array.
    Get the length of a string at a specific index.
    Get all the strings in the array.
    Exit the program.
    As you look through the code, you will see possibilities of exceptions.

Array Index Out of Bounds - If the user enters an index greater than or equal to 5 (or less than 0), it will throw an ArrayIndexOutOfBoundsException.

Null Pointer Exception - If the user tries to retrieve the length of a string at an index that hasn't been populated yet, it will throw a NullPointerException.

Number Format Exception - If the user enters a non-integer value when prompted for an index, Integer.parseInt will throw a NumberFormatException. */