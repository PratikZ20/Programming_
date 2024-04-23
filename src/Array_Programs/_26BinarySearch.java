package Array_Programs;

  public class _26BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 7,12};
        int key = 12;
        int low = 0;// Change: setting low to the first index of the array
        int high = arr.length-1;
        int index = -1; // Initialize index to -1, indicating not found
        while (low <= high) {
            int mid = low +( high- low) / 2; // Correction: Properly calculating the middle index
            if (key == arr[mid]) {
                index = mid; // Update the index if the key is found
                break;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else   {
                high = mid - 1;
            }
        }
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found ");
        }
    }

//public static void main(String[] args) {
//  int arr[] = {12,23,44,55,66,4};
//  int low = arr[0]; int high = arr.length-1;
//  int index = -1; int key = 4;
//  while (low <= high ){
//    int mid = (low+high)/2;
//    if(key == arr[mid]){
//      index = mid;
//      break;
//    } else if (key > arr[mid]) {
//      low = mid +1;
//
//    } else if (key < arr[mid]) {
//      high = mid -1;
//    }
//  }
//  if(index != -1){
//    System.out.println("element found at the index position is "+ index);
//  }
//  else{
//    System.out.println("not found");
//  }
//}
}
