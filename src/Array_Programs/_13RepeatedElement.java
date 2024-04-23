//package Array_Programs;
//
//public class _13RepeatedElement {
//    public static void main(String[] args) {
//        int arr[] = {10,10,20,30,20,10};
//        int count=0;
//        int reapeted [];
//        for(int i=0; i<arr.length; i++){
//            for(int j=i; j<arr.length; j++){
//                if(arr[i] == arr[j]){
//                    count++;
//                }
//            }
//        }
//        reapeted= new int[count];
//        for(int a : reapeted){
//            System.out.println(a);
//        }
//    }
//}
//
//package Array_Programs;
//public class _13RepeatedElement{
//    public static void main(String[] args) {
//        int arr[] = {1,2,44,33,2,44,2,66,44,88};
//        boolean counted[] = new boolean[arr.length];
//        for(int i=0; i<arr.length; i++){
//            int n = arr[i];
//            int count = 0;
//            if(counted[i]==false){
//                for(int j=0; j<arr.length; j++){
//                    if(n==arr[j]){
//                        count++;
//                        counted[j]=true;
//                    }
//                }
//                if (count>=2){
//                    System.out.println(n+" ");
//                }
//            }
//        }
//
//    }
//}

package Array_Programs;
class _13RepeatedElement{
    public static void main(String[] args) {
        int arr[] = {2,1,23,24,77,66,77,23};
        boolean isCounted[] = new boolean[arr.length];
        for(int i=0; i <arr.length; i++){
            int count = 0;
            if(isCounted[i]==false){
                for(int j=i; j<arr.length; j++){
                    if(arr[i]==arr[j]){
                        isCounted[j]=true;
                        count++;
                    }
                }
            }
            if(count!=2){
                System.out.println(arr[i]+" has maximum frequency ");
            }
        }
    }
}