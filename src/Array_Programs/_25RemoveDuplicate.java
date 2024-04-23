package Array_Programs;//package Array_Programs;
//
//public class _25RemoveDuplicate {
//    public static void main(String[] args) {
//        int arr[] = {12,12,33,33,14,15,16};
//        int j=0;
//        for(int i=0; i<arr.length-1; i++){
//            if(arr[i] != arr[i+1]){
//                arr[j] = arr[i];
//                j++;
//            }
//        }
//        arr[j] =arr[arr.length-1];
//        for(int i=0; i<j+1; i++){
//            System.out.println(arr[i]+"");
//        }
//    }
//}

public class _25RemoveDuplicate{
    public static void main(String[] args) {
        int arr[] = {1,4, 3, 5, 2, 5, 1, 24};
        int j =0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                arr[j] = arr[i];
                j++;
            }
        }

        arr[j] = arr[arr.length-1];
        for(int i=0; i<j+1; i++){
            System.out.println(arr[i]);
        }
    }
}
