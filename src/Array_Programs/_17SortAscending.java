package Array_Programs;

public class _17SortAscending {
    public static void main(String[] args) {
        int arr[] = {10,90,30,2,50,40};
        int temp ;
        for(int i=0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }
        for(int a : arr){
            System.out.println(a);
        }
    }
}
