package Array_Programs;

public class _23ReverseBothArray {
    public static void main(String[] args) {
        int arr1[] = {12,23,44,55};
        int arr2[] = {77,33,22};
        int merge[] = new int [arr1.length+ arr2.length];
        int index1 = arr1.length-1;
        int index2 = arr2.length-1;
        for(int i=0; i<=merge.length-1; i++){
            if(i<=arr1.length-1){
                merge[i] = arr1[index1--];
            }
            else {
                merge[i] =arr2[index2--];
            }
        }
        for(int a : merge){
            System.out.println(a);
        }
    }
}
