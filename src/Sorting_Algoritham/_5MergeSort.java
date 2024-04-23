package Sorting_Algoritham;

public class _5MergeSort {
public static void main(String[] args) {
    int arr[] = {22,1,2,34,5,3,6,88};
    int startInd = 0;
    int endInd = arr.length-1;
    int []sorted = mergeSort(arr, startInd, endInd);
    for(int a : sorted){
        System.out.print(a+" ");
    }
}
public static int [] mergeSort(int arr[], int startInd, int endInd){
    if(startInd < endInd){
        int mid = (startInd+endInd)/2;
        int left[] = mergeSort(arr, startInd, mid);
        int right[] = mergeSort(arr, mid+1, endInd);
        return merge(left, right);
    }
    return new int[]{arr[endInd]};
}
public static int [] merge(int left[], int right[]){
    int i=0, j=0, k=0;
    int merge[] = new int[left.length+right.length];
    while (i<left.length && j<right.length){
        if(right[j]<left[i]){
            merge[k++]=right[j++];
        }else {
            merge[k++]=left[i++];
        }
    }
    while (i<left.length){
        merge[k++]=left[i++];
    }
    while (j<right.length){
        merge[k++]=right[j++];

    }
    return merge;
}
}
