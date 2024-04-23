package Number_Programs;
import java.util.Map;
import java.util.Scanner;

public class _25SunnyNumber
{
    public static void main(String[] args) {
        for(int num =1; num<=1000; num++){
            getSunnyNumber(num);
        }
    }
    public static void getSunnyNumber(int n){
        if(getsqurt(n+1)){
            System.out.println(n+" is an sunny number");
        }
    }
    public static boolean getsqurt(double n){
        double square = Math.sqrt(n);
        return (square - Math.floor(square)==0);
    }

}
