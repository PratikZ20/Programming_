package Sorting_Algoritham;

public class _2SellectionSort {
 public static void main(String[] args) {
    int arr[] = {1,39,99,88,2,5};
    System.out.println("THE UNSORTED ARRAY :");
    getArray(arr);
    getSellectionSort(arr);
    System.out.println(" ");
    System.out.println("THE SORTED ARRAY :");
    getArray(arr);
}
public static void getArray(int arr[]){
    for(int a : arr){
        System.out.print(a +" ");
    }
}
public static void getSellectionSort(int arr[]){
    for(int i=0; i<arr.length-1; i++){
        int minArray = i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[j] > arr[minArray]){
                minArray = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[minArray];
        arr[minArray] = temp;
    }

  }
}
