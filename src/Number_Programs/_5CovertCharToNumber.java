package Number_Programs;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class _5CovertCharToNumber{

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("enter the number :");
        char ch = sc.next().charAt(0);
        //number can be only in the range of 0-9
        if(ch>='0' && ch <='9'){
            System.out.println((ch*2-96));
        }
        else{
            System.out.println(ch+" is not convert into the number ");
        }
    }
}
