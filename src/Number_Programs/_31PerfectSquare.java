package Number_Programs;

public class _31PerfectSquare {
//    public static void main(String[] args) {
////        int num = 49;
//        for(int num =1; num <=1000; num++){
//            if(getPerfecctSquare(num))
//                System.out.println(num +" is a Perfect square");
//        }
//    }
//    public static boolean getPerfecctSquare(int n){
//        if(n>=0){
//            int square = (int)Math.sqrt(n);
//            return ((square*square)==n);
//        }
//        return false;
//    }
public static void main(String[] args) {
    int num =4;
    if (getSquare(num)){
        System.out.println("Perfect square");
    }
}
public static boolean getSquare(int n){
    if(n>=0){
        int square = (int) Math.sqrt(n);
        return ((square*square)==n);
    }
    else {
        return false;
    }
}
}
