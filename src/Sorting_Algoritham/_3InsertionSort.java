package Sorting_Algoritham;

//step 1 -- in an array one part is in the sorted array and other part is in the unsorted array
//
public class _3InsertionSort {
//    public static void main(String[] args) {
//        int[] arr = {64, 25, 12, 22, 11};
//
//        System.out.println("Original Array:");
//        printArray(arr);
//
//        insertionSort(arr);
//
//        System.out.println("\nSorted Array:");
//        printArray(arr);
//    }
//
//    public static void insertionSort(int[] arr) {
//        int n = arr.length;
//        for (int i = 1; i < n; ++i) {
//            int key = arr[i];
//            int j = i - 1;
//
//            // Move elements of arr[0..i-1], that are greater than key,
//            // to one position ahead of their current position
//            while (j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j];
//                j = j - 1;
//            }
//            arr[j + 1] = key;
//        }
//    }
//
//    // Utility function to print an array
//    public static void printArray(int[] arr) {
//        for (int value : arr) {
//            System.out.print(value + " ");
//        }
//        System.out.println();
//    }
public static void main(String[] args) {
    int arr[] = {44,2,66,1,99,23};
    getArray(arr);
    getInsertionSort(arr);
    System.out.println("----------------");
    getArray(arr);
}
public  static void getArray(int arr[]){
    for(int a : arr){
        System.out.print(a+" ");
    }
    System.out.println(" ");
}
public static void getInsertionSort(int arr[]){
    for(int i=1; i<arr.length;i++){
        int j = i-1;
        int temp = arr[i];
        while (j>=0 && arr[j]> temp){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = temp;
    }
}
}
