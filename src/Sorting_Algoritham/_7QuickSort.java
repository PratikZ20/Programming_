package Sorting_Algoritham;
public class _7QuickSort {
    public static void main(String[] args) {
        int arr[] = {5,22,6,11,99,1,8,3};
        int low = 0;
        int high = arr.length-1;
        sort(arr, low, high);
        for(int a :arr){
            System.out.println(a+" ");
        }
    }
    public static void sort(int arr[], int star, int end) {
        if (star >= end){
            return;
        }
        //partision logic
        int p = partision(arr, star, end);
        //recursion
        sort(arr, star, p-1);
        sort(arr, p+1, end);

    }
    public static int partision(int arr[], int start, int end){
        int pivote =arr[start];
        int count = 0;

        // first is to make the pivote index at the right plasce.
        for(int i=start+1; i<=end; i++){
            if(arr[i]<=pivote){
                count++;
            }
        }
        //place pivot at the right index
        int pivoteIndex = start+count;

        //swap the start to the end index.

        int temp = arr[pivoteIndex];
        arr[pivoteIndex]=arr[start];
        arr[start]= temp;


        int i = start, j=end;
        while (i<pivoteIndex && j>pivoteIndex){
            while(arr[i]<pivote){
                i++;
            }
            while(arr[j]>pivote){
                j--;
            }
            if(i<pivoteIndex && j>pivoteIndex){
                int temp2 = arr[i];
                arr[i]=arr[j];
                arr[j]=temp2;
                i++;j--;

            }
        }
        return pivoteIndex;

    }

}
