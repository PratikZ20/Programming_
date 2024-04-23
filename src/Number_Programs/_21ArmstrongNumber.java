package Number_Programs;

public class _21ArmstrongNumber {
    public static void main(String[] args) {
        for(int num =1; num <=10000; num++){
            int count = getcount(num);
            int newNum = getArmstrongNum(num, count);
            if(num==newNum){
                System.out.println(newNum+ " is an amrstrong num");
            }
        }
    }
    public static int getcount(int n){
        int temp = n;
        int count = 0;
        while (temp != 0)
        {
            count++;
            temp/=10;
        }
        return count;
    }
    public static int getArmstrongNum(int n , int count){
        int arm = 0;
         int temp =n;
         while (temp!=0){
             int last = temp % 10;
             arm += getPower(last, count);
             temp /=10;
         }
         return arm;
    }
    public static  int getPower(int last, int count){
        int temp = count;
        int arm  = 1;
        while (temp!=0){
            arm *= last;
            temp--;
        }
        return arm;
    }
}
