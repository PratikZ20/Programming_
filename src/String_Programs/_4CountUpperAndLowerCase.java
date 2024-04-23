//package String_Programs;
//import java.util.Scanner;
//
//public class _4CountUpperAndLowerCase {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        // Prompt the user to enter the string
//        System.out.println("Enter the String: ");
//        String str = sc.nextLine();
//
//        // Variables to count the number of upper and lower case letters
//        int countUpper = 0;
//        int countLower = 0;
//        int countNumber = 0;
//        int countSpecial=0;
//        char ch;
//
//        // Iterate through each character in the string
//        for(int i = 0; i < str.length(); i++) {
//            ch = str.charAt(i);
//
//            // Check if the character is an uppercase letter
//            if (ch >= 'A' && ch <= 'Z') {
//                countUpper++;
//                System.out.println(ch + " is an uppercase letter.");
//            }
//            // Check if the character is a lowercase letter
//            else if (ch >= 'a' && ch <= 'z') {
//                countLower++;
//                System.out.println(ch + " is a lowercase letter.");
//            } else if (Character.isDigit(ch)) {
//                countNumber++;
//                System.out.println(ch+" is a number letter");
//
//            }
//            else if (isSpecialCharacter(ch)) {
//                countSpecial++;
//                System.out.println(ch + " is a special character.");
//            }
//        }
//        // Print the count of uppercase and lowercase letters
//        System.out.println("Number of uppercase letters: " + countUpper);
//        System.out.println("Number of lowercase letters: " + countLower);
//        System.out.println("Number counted "+ countNumber);
//        System.out.println("Special Char "+countSpecial);
//
//        // Close the scanner
//        sc.close();
//    }
//    private static boolean isSpecialCharacter(char ch) {
//        String specialChar = "`!@#$%^&*(){}|:<>";
//        return specialChar.contains(String.valueOf(ch));
//    }
//}

package String_Programs;

public class _4CountUpperAndLowerCase {
    public static void main(String[] args) {
        String s = "jkskjDnfs999%3";
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countSpeacial =0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >='A' && ch<='Z'){
                countUpper++;
                System.out.println(ch);
            }
            else if(ch>='a' && ch<='z'){
                countLower++;
                System.out.println(ch);
            }
            else if(Character.isDigit(ch)){
                countNumber++;
                System.out.println(ch);
            }
            else if(isSpecialCharacter(ch)){
                countSpeacial++;
                System.out.println(ch);
            }else {
                System.out.println("nooting");
            }
        }

        System.out.println("-----------------------------");
        System.out.println(countUpper);
        System.out.println(countLower);
        System.out.println(countNumber);
        System.out.println(countSpeacial);
    }
    private static boolean isSpecialCharacter(char ch) {
        String specialChar = "`!@#$%^&*(){}|:<>";
        return specialChar.contains(String.valueOf(ch));
    }
}
