package Test;

public class _2Buuble_Sort {
    public static void main(String[] args) {
        int arr[] = {12,1,14,18,2};

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int a : arr){
            System.out.println(a);
        }

    }
}
