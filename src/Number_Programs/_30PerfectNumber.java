package Number_Programs;
//perfect  number =  6 = 1+2+3 = 6.
public class _30PerfectNumber {
    public static void main(String[] args) {
//        int num = 6;
        for(int num=1; num<1000; num++) {
            int sum = getPerfectNumber(num);
            if (sum == num)
                System.out.println(sum + " is a Perfect Number");
        }
    }
    public static int getPerfectNumber(int n){
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n % i == 0)
                sum +=i;

        }
        return sum;
    }
}

