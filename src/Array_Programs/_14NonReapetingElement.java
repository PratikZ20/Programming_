//package Array_Programs;
//
//public class _14NonReapetingElement {
//    public static void main(String[] args) {
//        int arr[] =  {4,3,5,2,5,1,24};
//        int nonReapeated[];
//        int count = 0;
//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i]!=arr[j]){
//                    count++;
////                    break;
//                }
//            }
//        }
//        nonReapeated  = new int[count];
//        int index =0;
//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i]!=arr[j]){
//                    nonReapeated[index] = arr[i];
//                    index++;
//                    break;
//                }
//            }
//        }
//        for(int a :nonReapeated){
//            System.out.println(a);
//        }
//    }
//
//}
