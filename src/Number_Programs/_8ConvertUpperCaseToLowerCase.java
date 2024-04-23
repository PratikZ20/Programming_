package Number_Programs;

import java.util.Scanner;

public class _8ConvertUpperCaseToLowerCase {
    public static void main(String[] args) {
        System.out.println("enter the char :");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            // Convert uppercase to lowercase
            System.out.println((char) (ch + 32));
            System.out.println("Lowercase Alphabet");
        } else if (ch >= 'a' && ch <= 'z') {
            // Convert lowercase to uppercase
            System.out.println((char) (ch - 32));
            System.out.println("Uppercase Alphabet");
        } else {
            System.out.println(ch + " is not an alphabet");
        }
    }
}
