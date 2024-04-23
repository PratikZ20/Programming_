package Array_Programs;

public class _19CountOddEven {
    public static void main(String[] args) {
        int arr[] = {20,23,2,26,15};
        getEvenCount(arr);
    }
    public static void getEvenCount(int arr[]){
        int evenCount = 0;
        int oddCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        System.out.println(evenCount+" are the even count");
        System.out.println(oddCount+" are the odd count");
    }
}
