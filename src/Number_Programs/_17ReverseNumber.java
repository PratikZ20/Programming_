package Number_Programs;

public class _17ReverseNumber {
    public static void main(String[] args) {
        int num = 123321;
        int newNumber = getReverseNumber(num);
        if(num == newNumber)
            System.out.println(newNumber+" and "+ num + " is same "+ " it is an reverse number");
        else
            System.out.println(newNumber+" and "+ num + " is not same "+ " it is an reverse  number");
    }
    public static int getReverseNumber(int n){
        int temp = n, reverse=0;
        while (temp !=0 ){
            int last = temp % 10;
            reverse = (reverse*10) + last;
            temp /= 10;
        }
        return  reverse;
    }
}
