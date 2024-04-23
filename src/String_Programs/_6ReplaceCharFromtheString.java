package String_Programs;

import java.util.Scanner;

public class _6ReplaceCharFromtheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        System.out.println("Enter the char to modified ");
        char k = sc.next().charAt(0); // the character to be replaced
        String temp = " ";
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch==k){
                temp +='$';
            }
            else {
                temp+=ch;
            }

        }
        System.out.println(temp);
    }

}
