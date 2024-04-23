package Number_Programs;

// 352 = 3+5+2=10 then again the 10 is 1+0= 1 if we got an value 1 then that num is magic number.
public class _38MagicNumber {
    public static void main(String[] args) {
        int num = 352;
        int sum = getMagic(num);
       if(getNewMagic(sum)==1)
           System.out.println(num + " is a magic number");
    }
    public static int getMagic(int num){
        int temp = num;
        int sum = 0;
        while (temp !=0){
            int last = temp % 10;
            sum +=last;
            temp/=10;
        }
        return sum;

    }
    public static int getNewMagic(int sum){
        int newNum = 0;
        int temp = sum;
        while (temp != 0){
            int last = temp % 10;
            newNum += last;
            temp/=10;
        }
        return newNum;
    }
}
