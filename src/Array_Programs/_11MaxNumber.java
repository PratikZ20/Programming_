//package Array_Programs;
//
//public class _11MaxNumber {
//    public static void main(String[] args) {
//        int arr[] = {4,3,2,5,6,9,12};
//        int max=Integer.MIN_VALUE, max2=Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){
//           if(arr[i]>max){
//               max2=max;
//               max = arr[i]; //swap the value
//           }
//           else if(arr[i] > max2 && max   != arr[i]){
//                max2=arr[i];
//           }
//        }
//        System.out.println(max2);
//        System.out.println(max);
//    }
//}


package Array_Programs;
class _11MaxNumber{
    public static void main(String[] args) {
        int arr[] = {10,2,4,3,19,27};
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<max1){
                max2 = max1;
                max1 = arr[i];

            }else if(arr[i] < max2 && max1 != arr[i]) {
                max2 = arr[i];
            }
        }
        System.out.println(max1+ " is the first samllest element");
        System.out.println(max2+ " is the  second smallest element");

    }
}