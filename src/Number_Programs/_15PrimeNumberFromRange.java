package Number_Programs;

public class _15PrimeNumberFromRange  {
    public static void main(String[] args) {
        int count = 0;
        for(int i=100; i>=1; i--){
            if (checkPrimeNumber(i)){
                System.out.print(i+",");
                count++;
            }
        }
        System.out.println("\n"+" is the count number between the range "+count);
    }
    public static boolean checkPrimeNumber(int n){
        if(n <=1){
            return false;
        }
        for(int i=2; i<=n/2; i++){
            if(n%2==0){
                return false;
            }
        }
        return true;
    }
}
