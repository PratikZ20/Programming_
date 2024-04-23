package Number_Programs;

public class _13PrimeNumber {
    public static void main(String[] args) {
        int num = 5;
        if(getPrimeNumber(num)){
            System.out.println(num+" is a prime number");
        }
        else {
            System.out.println(num +" is not an prime number");
        }
    }
    public static boolean getPrimeNumber(int n){
        if(n<2)
            return false;
        for(int i = 2; i<n/2; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
