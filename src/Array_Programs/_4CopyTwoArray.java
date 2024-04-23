package Array_Programs;

public class _4CopyTwoArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] ={12,34,55};
        int copy[] = new int[arr1.length+ arr2.length];
        int index=0;
        for(int i=0; i<arr1.length; i++){
            copy[index++] = arr1[i];
        }
        for(int j=0; j<arr2.length; j++){
            copy[index++] = arr2[j];
        }
        for(int a : copy){
            System.out.println(a);
        }
    }
}














