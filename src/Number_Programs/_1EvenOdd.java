package Number_Programs;

import java.util.Scanner;

public class _1EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        if(num % 2 ==0 )
            System.out.println("Even number ");
        else
            System.out.println("Not an even number");
        
    }
}
