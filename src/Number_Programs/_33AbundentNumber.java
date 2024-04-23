package Number_Programs;

//18 => 1, 2, 3, 6, 9 =21 then 21 > 18 == abundent no;
public class _33AbundentNumber {
    public static void main(String[] args) {
//        int num = 18;
        for(int num=1; num<=100; num++){
            int abundent = getAbundentNum(num);
            if(abundent>num)
                System.out.println(num +" is an abundent num");
        }
    }
    public static int getAbundentNum(int n){
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n % i == 0)
                sum +=i;
        }
        return sum;
    }
}
