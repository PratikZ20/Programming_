package Array_Programs;

public class _5EvenArray {
    public static void main(String[] args) {
        int arr[] = {10,21,2,14,44};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        int even [] = new int [count];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 ==0){
                even[index++]=arr[i];

            }
        }
        for(int a : even)
            System.out.println(a);
    }
}














