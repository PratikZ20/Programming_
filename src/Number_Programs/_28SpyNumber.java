package Number_Programs;


////        int num =1124 ===> sum and product of a number if both are same then this number is Spy Number.
public class _28SpyNumber {
    public static void main(String[] args) {
        for(int num =1; num<=2000; num++){
            int sum= getSpuNumber(num);
            int product = getSpyNumberProduct(num);
            if(sum == product){
                System.out.println(num +" is an Spy number");
            }
        };
    }
    public static  int getSpuNumber(int n){
        int temp = n;
        int sum = 0;
        while (temp != 0){
            int last = temp % 10;
            sum += last;
//            product *= last;
            temp /=10;
        }
        return  sum;
    }
    public static int getSpyNumberProduct(int n){
        int temp = n;
        int product = 1;
        while (temp != 0){
            int last = temp % 10;
            product *=last;
            temp/=10;
        }
        return product;
    }
}
