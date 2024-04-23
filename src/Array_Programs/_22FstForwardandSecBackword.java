package Array_Programs;

public class _22FstForwardandSecBackword {
    public static void main(String[] args) {
        int arr1[] = {12,22,13,15};
        int arr2[] = {66,44,22};
        int merge[] = new int [arr1.length+ arr2.length];
//        int index1 = arr1.length-1;
        int index2 = arr2.length-1;
        for(int i=0; i<=merge.length-1; i++){
            if(i<=arr1.length-1){
                merge[i]=arr1[i];
            }else {
                merge[i]=arr2[index2--];
            }
        }
        for(int a : merge){
            System.out.println(a);
        }
    }
}
