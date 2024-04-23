package Searching_Algorithams;

public class _2BinarySearch {
public static void main(String[] args) {
    int arr[] = {99,44,2,2,45,88,21};
    for(int b : arr){
        System.out.print(b+" ");
    }
    System.out.println(" ");
    int key = 2;
    getSorted(arr);
    System.out.println("SORTED ARRAY ARE :");
    for(int a : arr){
        System.out.print(a+" ");
    }
    System.out.println(" ");
    int result = getBinarySort(arr,key);
    if(result != -1){
        System.out.println("ELEMENT FOUND " +key+ " at the index position "+ result );
    }
}
public static void getSorted(int arr[]){
    int temp ;
    for (int i=0; i<arr.length-1; i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[i] > arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
public static int getBinarySort(int arr[], int key)
{
    int low = 0;
    int high = arr.length-1;
    while (low <= high){
        int mid = (low + high)/2;
        if (arr[mid] == key){
            return mid;
        }
        else if(key > arr[mid]){
            low =mid + 1;
        }
        else if( key < arr[mid]){
            high = mid -1;
        }
    }
    return  -1;
}
}

