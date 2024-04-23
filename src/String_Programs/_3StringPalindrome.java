package String_Programs;

import java.util.Scanner;

public class _3StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String ");
        String s = sc.nextLine().toLowerCase();
        String rev = "";
        for(int i=s.length()-1; i>=0; i--){
            rev += s.charAt(i);
        }
        if(s.equalsIgnoreCase(rev)){
            System.out.println(rev + " is same "+ s + " String palindrome");
        }
        else {
            System.out.println(rev + " is same "+ s + " String not palindrome");
        }
    }
}