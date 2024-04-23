package Array_Programs;

public class _10MaxFrequency {
    public static void main(String[] args) {
        int arr[] = {10,20,10,20,10,10,20};
        boolean counted[] = new boolean[arr.length];
        int maxCount = 0, maxElement=0;
        for(int i=0; i<arr.length; i++){
            int n=arr[i];
            if(counted[i]==false){
                int count =0;
                for(int j=0; j<arr.length; j++){
                    if(n==arr[j]){
                        count++;
                        counted[j]=true;
                    }
                }
                if(count> maxCount){
                    maxCount =count;
                    maxElement=n;
                }
            }

        }
        System.out.println(maxElement+ " msx count is "+ maxCount);
    }
}
