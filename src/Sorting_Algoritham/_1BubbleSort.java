package Sorting_Algoritham;

public class _1BubbleSort {
    public static void main(String[] args) {
        //create an two array then we have to compare arr[i] to arr[j] then swap.
        int arr[] = {33, 4, 32, 55, 88, 99};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int a : arr) {
            System.out.print(a+ " ");
        }
    }
}
