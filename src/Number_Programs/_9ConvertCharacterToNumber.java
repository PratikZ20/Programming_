package Number_Programs;

public class _9ConvertCharacterToNumber {
    public static void main(String[] args) {
        // Define the character representing the digit
        char ch = '5'; // Change this to the character you want to convert
        // Check if the character is a digit
        if (ch >= '0' && ch <= '9') {
            // Convert the character digit to its numerical value
            int numericValue = ch - '0';
            System.out.println("Numerical value of '" + ch + "' is: " + numericValue);
        } else {
            System.out.println("'" + ch + "' is not a character digit (0-9).");
        }
    }
}
