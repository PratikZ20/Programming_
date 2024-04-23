package Test;

public class _4SecondLargest {
    public static void main(String[] args) {
        int arr[] = {12,11,77,88,99};
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length-1; j++){
                if(arr[i] > firstLargest){
                    firstLargest = arr[i];

                }
            }
        }
    }
}
