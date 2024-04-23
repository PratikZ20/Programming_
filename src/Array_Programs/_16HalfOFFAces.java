package Array_Programs;

public class _16HalfOFFAces {
    public static void main(String[] args) {
        int arr[] = {10,20,30,50,87,90,66};
        int n =arr.length;
        getOrder(arr, n);
    }
    public static void getOrder(int a[],int n){
        int temp;
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            for(int j=n/2; j<n-1; j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] =a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}
