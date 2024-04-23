//package Array_Programs;
//
//class _14NonReapeting {
//    public static void main(String[] args) {
//        int arr[] = {1,4, 3, 5, 2, 5, 1, 24};
//
//        // Loop through each element in the array
//        for (int i = 0; i < arr.length; i++) {
//            boolean isRepeating = false;
//
//            // Check if the current element is repeating by comparing it with all other elements
//            //i and j ==> it represent the index value
//            // arr[i] and arr[j] it represent the actual value which is present in that arr index.
//
//            for (int j = 0; j < arr.length; j++) {
//                if (i != j && arr[i] == arr[j]) {
//                    isRepeating = true;
//                    break;
//                }
//            }
//
//            // If the current element is not repeating, print it
//            if (!isRepeating) {
//                System.out.println(arr[i]);
//            }
//        }
//
//    }
//}
//
//package Array_Programs;
//
//public class _14NonReapeting {
//    public static void main(String[] args) {
//        int arr[] = {4,3,2,7,1,2,1};
//        for(int i=0; i<arr.length; i++){
//            boolean isFound = false;
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i]==arr[j]){
//                    isFound = true;
//                    break;
//                }
//
//            }
//            if(!isFound){
//                System.out.println(arr[i]);
//            }
//        }
//
//    }
//}

package Array_Programs;

class _14NonRepeating{
    public static void main(String[] args) {
        int arr[] = {1,2,33,44,2,5,2};
        for(int i=0; i<arr.length; i++){
            boolean isFound = false;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    isFound =true;
                    break;
                }
            }
            if(!isFound){
                System.out.println(arr[i]);
            }
        }
    }
}












