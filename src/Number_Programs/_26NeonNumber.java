package Number_Programs;

public class _26NeonNumber {
    public static void main(String[]args){
//        int num = 9;
        for(int num = 1; num <= 10000000; num++) {
            int Neon = getNeonNum(num);
            if (num == Neon)
                System.out.println(num+" Neon number");
        }
    }
    public static int getNeonNum(int n){
        int square = n * n;
        int temp = square;
        int sum =0;
        while (temp !=0 ){
            int last = temp % 10;
            sum +=last;
            temp/=10;
        }
        return sum ;
    }
}
