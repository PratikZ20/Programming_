package Number_Programs;

//lcm = 12*14 =>168 then , which one is larger number from the above no, then apply loop to the max number then
// which max num can be divide then that number is an lcm of a number. so 14 is max  14 %
public class _35LCM {
    public static void main(String[] args) {
        int num1 = 12, num2 = 14;
        int newMax = num1 * num2;
        int lcm=0;
        int max = (num1 > num2) ? num1 : num2;
        for(int i= max; i<=newMax; i++){
            if(i%num1==0 && i%num2==0){
                lcm=i;
                break;
            }
        }
        System.out.println(lcm+ " is the lcm");

    }

}
