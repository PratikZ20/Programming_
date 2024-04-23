package Sorting_Algoritham;

public class  _6QuickSort {
    public static void main(String[] args) {
        int arr[] = {99,22,4,22,44};
        int low = 0;
        int last = arr.length-1;
        getSort(arr,low,last);
        for(int a : arr){
            System.out.println(a+" ");
        }
    }
    public static void getSort(int arr[], int low, int high){
        if(low > high){
            return;
        }
        int start = low, end = high, mid = (start+end)/2;
        int pivot = arr[mid];
        while (start<=end){
            while (arr[start]<pivot){
                start++;
            }
            while (arr[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;end--;
            }
        }
        getSort(arr,low,end);
        getSort(arr, start, high);
    }

}
