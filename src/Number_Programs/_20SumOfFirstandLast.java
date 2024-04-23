package Number_Programs;

public class _20SumOfFirstandLast {
    public static void main(String[] args) {
        int num = 7128;
        int last = num % 10;
        int temp = num;
        int calculate = 0;
        while (temp > 9){
            temp/=10;
        }
        calculate = last + temp;
        System.out.println(calculate+" is the sum");
    }
}
