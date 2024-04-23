package Array_Programs;

public class _12MinNumber {
    public static void main(String[] args) {
        int arr[] = {10,20,30,100,200,50,30,2};
        int min = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    min = arr[i];
                }
            }
        }
        System.out.println(min);
    }
}
