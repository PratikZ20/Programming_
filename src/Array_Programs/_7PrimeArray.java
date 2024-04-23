//package Array_Programs;
//
//public class _7PrimeArray {
//    public static void main(String[] args) {
//        int []arr = {32,1,2,5,7};
//        for(int a : arr){
//            if(getPrime(a)){
//                System.out.println(a+" is a prime number ");
//            }
//        }
//    }
//    public static boolean getPrime(int a){
//        if(a<2)
//            return false;
//        for(int i=2; i<a/2; i++){
//            if(a % i == 0)
//                return false;
//        }
//        return true;
//    }
//}

package Array_Programs;

class _7PrimeArray{
    public static void main(String[] args) {
        int arr[] = {2,3,4,1,5,7,9};
        for(int a :arr){
           if(checkPrime(a)){
               System.out.println(a);
           }
        }

    }
    public static boolean checkPrime(int a){
        if(a < 2){
            return false;
        }
        for(int i=2; i<a/2; i++){
            if(i%2==0){
                return false;
            }
        }
        return true;
    }
}
















