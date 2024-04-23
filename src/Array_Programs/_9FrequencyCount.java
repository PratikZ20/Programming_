package Array_Programs;

public class _9FrequencyCount {
    public static void main(String[] args) {
        int arr[] = {10,20,102,10,20,10,2,3};
        boolean counted[] = new boolean[arr.length];
        for(int i=0; i<arr.length; i++){
            if(counted[i]==false){
                int count = 0;
                for(int j=i; j<arr.length; j++){
                    if(arr[i]==arr[j]){
                        count++;
                        counted[j]=true;
                    }
                }
                System.out.println(arr[i]+ " is counted "+count);
            }
        }
    }
}















