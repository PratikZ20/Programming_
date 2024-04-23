package Sorting_Algoritham;

import java.util.Arrays;

public class _4MergeSort {
    public static void main(String[] args) {
        int arr[]  ={ 12,15,25,1,3,87};
        int [] sorted = divide(arr);
        for(int a :sorted){
            System.out.println(a+" ");
        }
    }
    public static int[] divide(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int left[] = divide(Arrays.copyOfRange(arr, 0, mid));
        int right[] =divide(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left, right);
    }
    public static int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int merge[] = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (right[j] < left[i]) {
                merge[k++] = right[j++];
            } else {
                merge[k++] = left[i++];
            }
        }

        // Copy remaining elements from left array
        while (i < left.length) {
            merge[k++] = left[i++];
        }

        // Copy remaining elements from right array
        while (j < right.length) {
            merge[k++] = right[j++];
        }

        return merge;
    }


}
