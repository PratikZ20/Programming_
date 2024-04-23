package Number_Programs;
public class _15PrimeNumber {
    public static void main(String[] args) {
        int num = 5;
        boolean isprime = true;

        if(num < 2){
            isprime = false;
        }
        else {
            for(int i=2; i<num/2; i++)
                if(num % i==0) {
                    isprime = false;
                    break;
                }
        }
        String result = isprime ? "prime number" :" not an prime number";
        System.out.println(num + " is a "+ result);
    }
}
