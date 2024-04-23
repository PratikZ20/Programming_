package String_Programs;

public class _20StringPalindrome {
    public static void main(String[] args) {
        String str = "geeg".toLowerCase();
        Boolean st2 = getPalindrome(str);
        System.out.println(st2 + "String palindrome");
    }
    public static boolean getPalindrome(String str){
        String rev = "";
        boolean ans = false;
        for(int i=str.length()-1; i>=0; i--){
            rev +=str.charAt(i);
        }
        if(rev.equals(str)){
            return true;
        }
        return ans;
    }
}
