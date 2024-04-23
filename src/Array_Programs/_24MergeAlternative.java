package Array_Programs;

public class _24MergeAlternative {
    public static void main(String[] args) {
        int arr1[] = {12,2,34,5,55};
        int arr2[] = {44,33,22};
        int merge[] = new int[arr1.length + arr2.length];
        int index1 = 0, index2 = 0;
        for(int i = 0; i < merge.length; i++){
            if(index1 == arr1.length){
                merge[i] = arr2[index2++];
            }
            else if(index2 == arr2.length){
                merge[i] = arr1[index1++];
            }
            else if(i % 2 == 0){
                merge[i] = arr1[index1++];
            }
            else {
                merge[i] = arr2[index2++];
            }
        }
        for(int a : merge){
            System.out.println(a);
        }
    }
}
