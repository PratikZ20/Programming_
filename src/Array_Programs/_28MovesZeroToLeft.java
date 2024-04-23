package Array_Programs;

public class _28MovesZeroToLeft {
    public static void main(String[] args) {
        int arr[] = {5,2,0,1,0,19,3,0,9,0};
        movesZero(arr);
        for(int a : arr){
            System.out.println(a);
        }
    }
    public static void movesZero(int arr[]){
        int left = arr.length-1;  //for reversed purpose we have to reversed the zero
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]!=0){
               arr[left--]=arr[i];
            }
        }
        while (left>=0){
            arr[left--]=0;
        }
    }
}
