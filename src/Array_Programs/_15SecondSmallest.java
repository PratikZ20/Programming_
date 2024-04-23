package Array_Programs;

public class _15SecondSmallest {
    public static void main(String[] args) {
        int arr[] = {4,3,2,5,6,9,12};
        int max=Integer.MAX_VALUE, max2=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<max){
                max2=max;
                max = arr[i]; //swap the value
            }
            else if(arr[i] < max2 ){
                max2=arr[i];
            }
        }
        System.out.println(max2);
        System.out.println(max);

    }

}