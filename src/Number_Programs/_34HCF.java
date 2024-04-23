package Number_Programs;

import java.sql.SQLOutput;

// 18, 12 , == higest num = 6;
public class _34HCF {
    public static void main(String[] args) {
        int num1= 18, num2 = 12;
        int HCF = getHcf(num1, num2);
        System.out.println(HCF+" IS HCF");
    }
    public static int getHcf(int num1, int num2){
        int hcf = 0;
        for(int i=1; i<= num1 || i<=num2; i++){
            if(num1 % i==0 && num2 % i ==0)
                hcf = i;

        }
        return hcf;
    }
}
