package Searching_Algorithams;

public class _1LinearSearch{
    public static void main(String[] args) {
        int arr []  = {14,24,43,6,78};
        int key = 14;
        boolean isfound = false;
        int index = -1;
        for(int i=0; i<arr.length-1; i++){
            if(key==arr[i])
            {
                isfound = true;
                index = i;
                break;
            }
        }
        if(isfound){
            System.out.println("Number is found "+index);
        }
        else {
            System.out.println("Number is not found ");
        }
    }
}
