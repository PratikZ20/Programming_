package String_Programs;

public class _8SumOFNum{
    public static void main(String[] args) {
        String s = "87Pratik7";
        int sum =0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9'){
                sum+=(ch-48);        //(ch-48) is the value that we can calculate.
            }
        }
        System.out.println(sum);
    }

}