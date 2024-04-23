package Number_Programs;

public class _15NthPrimeNumber {
//    public static void main(String[] args) {
//        int nth = 5;
//        int primeCount =0;
//        for(int i=1; true; i++){
//            int num = i;
//            boolean isprime = true;
//            if(num<=1){
//                isprime= false;
//            }
//            for(int j=2; j<=num/2; j++ ){
//                if(num%j==0){
//                    isprime=false;
//                    break;
//                }
//            }
//            if (isprime)
//                primeCount++;
//            if(primeCount==nth){
//                System.out.println(num);
//                break;
//            }
//        }
//    }

//    public static void main(String[] args) {
//        int nth = 5, primeCount=0;
//        getNum(nth, primeCount);
//    }
//    public static void getNum(int nth, int primeCount){
//        for(int i=1; true; i++){
//            int num = i;
//            boolean isprime = true;
//            if(num<=1)
//                isprime = false;
//            for(int j=2; j<=num/2; j++){
//                if(num% j==0) {
//                    isprime = false;
//                    break;
//                }
//            }
//            if (isprime)
//                primeCount++;
//            if(primeCount==nth) {
//                System.out.println(num+" is the nth prime number");
//                break;
//            }
//        }
//    }

    public static void main(String[] args) {
        int nth = 5, primeCount = 0;
        getPrimeCount(nth, primeCount);
    }
    public static void getPrimeCount(int nth, int primeCount){
        for(int i=1; true; i++){
            int num = i;
            boolean isPrime = true;
            if(num <=1){
                isPrime = false;
            }
            for(int j=2; j<=num/2; j++){
                if(num % j==0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
                primeCount++;
            if(primeCount==nth){
                System.out.println(num+" is the nth prime number ");
                break;
            }
        }
    }
}
