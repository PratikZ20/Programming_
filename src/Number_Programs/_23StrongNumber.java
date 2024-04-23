package Number_Programs;

// 155 = 5*5 = 125 then add
public class _23StrongNumber {
    public static void main(String[] args) {
        for(int num = 1; num <=100000; num++) {
            if (getStrong(num) == num)
                System.out.println(num);
        }
    }
    public static int getStrong(int n){
        int temp = n;
        int strong = 0;
        while (temp!=0){
            int last = temp % 10;
            strong += getfact(last);
            temp /=10;
        }
        return  strong;
    }
    public static int getfact(int last){
        int fact = 1;
        for(int i=1; i<=last; i++){
            fact *=i;
        }
        return fact;
    }
}
