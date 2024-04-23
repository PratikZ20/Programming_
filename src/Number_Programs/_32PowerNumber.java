package Number_Programs;

// 2*2 = 4
public class _32PowerNumber {
//    public static void main(String[] args) {
//        int num = 4;
////        int sq = num * num;
////        System.out.println(sq);
//        double sq = getPowerNumber(num);
//        System.out.println(sq);
//    }
//    public static double getPowerNumber(double num){
//       final int power = 2;
//       return Math.pow(num, power);
//    }
public static void main(String[] args) {
    int num = 4, power = 2;
    int sum = getPower(num, power);
    System.out.println(sum);
}
public static int getPower(int n, int p){
    int temp = p;
    int result = 1;
    while (temp !=0){
        result *=n;
        temp--;
    }
    return result;
}
}
