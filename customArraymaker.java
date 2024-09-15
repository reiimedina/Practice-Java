import java.util.Scanner;

public class customArraymaker {
    static int num; // Static variable to track numbers

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter either a character or a number
        System.out.println("Enter a character or a number:");
        String userInput0 = sc.nextLine();

        boolean isString = false; // To track if input is a string

        // Attempt to parse the input as a number
        try {
            num = Integer.parseInt(userInput0);
            System.out.println("You entered a number: " + num);
        } catch (NumberFormatException e) {
            // If the input is not a number, treat it as a character or string
            System.out.println("You entered a character or string: " + userInput0);
            isString = true; // Mark that the input was a string
        }

        // Input for rows
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();

        // Input for columns
        System.out.println("Enter the number of columns:");
        int columns = sc.nextInt();

        // Generate the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (isString) {
                    // If input was a string, print the string in each cell
                    System.out.print(userInput0 + "\t");
                } else {
                    // If input was a number, increment and print the number
                    num++;
                    System.out.print(num + "\t");
                }
            }
            System.out.println(); // Move to the next row after printing a row
        }

        sc.close(); // Close the scanner
    }
}
