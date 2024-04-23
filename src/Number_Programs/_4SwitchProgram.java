package Number_Programs;
import java.util.*;

public class _4SwitchProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the char :");
        char ch = sc.next().charAt(0);
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel ");
            default:
                System.out.println("consonent");
        }
    }
}
