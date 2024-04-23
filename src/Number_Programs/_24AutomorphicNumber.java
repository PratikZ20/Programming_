package Number_Programs;
public class _24AutomorphicNumber {
    public static void main(String[] args) {
         for(int num = 1; num<=10000; num++){
             int count = getcount(num);  //2
             int rev = getReverse1(num);  //67
             int square = num * num ;  //5776
             int newNUM1 = getReverse(count, square);
             if(rev == newNUM1){
                 System.out.println(num +" is automorphic number");
             }
         }
    }
    public static int getcount(int n){
        int count = 0;
        int temp = n;
        while (temp != 0){
            count++;
            temp /=10;
        }
        return count;
    }
    public static int getReverse1(int n){
        int rev = 0;
        int temp = n;
        while (temp !=0 ){
            int last = temp % 10;
            rev = (rev*10) + last;
            temp /=10;
        }
        return rev;
    }
    public static int getReverse(int newNum, int square){
        int temp = newNum;
        int sq = square;
        int rev = 0;
        while(sq != 0 && temp!=0){
            int last = sq % 10;
            rev = (rev*10) + last;
            sq/=10;
            temp--;
        }
        return rev;
    }
}
