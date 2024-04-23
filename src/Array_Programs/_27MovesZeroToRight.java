package Array_Programs;

public class _27MovesZeroToRight {
    public static void main(String[] args) {
        int arr[] = {8,20,2,0,1,0,9,0,3,0};
        moveZeros(arr);
        for(int a : arr){
            System.out.print(a+ ", ");
        }
    }
    public static void moveZeros(int arr[]){
        int ledt = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[ledt++]=arr[i];
            }

        }
        while (ledt<arr.length){
            arr[ledt++]=0;
        }
    }
}
