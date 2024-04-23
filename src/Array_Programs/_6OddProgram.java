package Array_Programs;

public class _6OddProgram {
    public static void main(String[] args) {
        int arr[] ={10,20,11,22,343,17};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                count++;
            }
        }
        int odd[] = new int[count];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 !=0){
                odd[index] = arr[i];
                index++;
            }
        }
        for(int a : odd){
            System.out.println(a);
        }
    }
}
