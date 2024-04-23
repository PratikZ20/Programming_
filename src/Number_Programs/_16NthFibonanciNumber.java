package Number_Programs;

public class _16NthFibonanciNumber {
    public static void main(String[] args) {
        int nth = 8;
        int a = 0, b = 1;
        int temp = 0;
        for(int i=1; i<nth; i++){
             temp = a +b;
            b = a;
            a = temp;
        }
        System.out.println(temp+ " is the "+ nth + " fibonanci number ");
    }
}
