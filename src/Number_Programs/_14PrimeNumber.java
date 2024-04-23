package Number_Programs;

public class _14PrimeNumber {
    public static void main(String[] args) {
        int num = 10;
        getPrime(num);
    }
    public static void getPrime(int n){
        int count = 0;
        if(n<2)
            System.out.println(n+" not an prime number");

        for(int i=1; i<=n;i++){
            if(n%i==0)
                count+=1;
        }

        if (count > 2)
            System.out.println(n+  " is not an prime number ");
        else
            System.out.println(n+" is an prime number ");

    }
}
