package Number_Programs;

import java.util.Scanner;

public class _2OddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int num = sc.nextInt();
        if(num % 2 !=0)
            System.out.println("ODD number");
        else
            System.out.println("not an odd number");
        
    }
}
