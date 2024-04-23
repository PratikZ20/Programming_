package Number_Programs;

public class _18PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        if (getPalindrome(num)){
            System.out.println(num+" is a palimdrome nnumber");
        }
    }
     static boolean getPalindrome(int n){
        int temp = n;
        int rev = 0;
        while (temp !=0){
            int last = temp % 10;
            rev = (rev*10)+ last;
            temp /=10;
        }
        if(n==rev)
            return  true;
        else
            return false;
    }
}
