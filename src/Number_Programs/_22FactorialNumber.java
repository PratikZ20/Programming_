package Number_Programs;

public class _22FactorialNumber {
    public static void main(String[] args) {
        int num = 22;
        for(int i=1; i<=num; i++){
            if(num % i == 0)
                System.out.println(i);
        }
    }
}
