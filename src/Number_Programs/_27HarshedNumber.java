package Number_Programs;

// harshed number = 21 => 1+2= 3, 21/3 == 0
public class _27HarshedNumber {
    public static void main(String[] args) {
        for(int num= 1; num <=50; num++){
            int sum = getHarshedNumber(num);
            if(num % sum == 0)
                System.out.println(num + " is a harshed number");
        }
    }
    public static int getHarshedNumber(int n){
        int temp = n, sum = 0;
        while ( temp != 0){
            int last = temp % 10;
            sum += last;
            temp/=10;
        }
        return  sum;
    }

}
