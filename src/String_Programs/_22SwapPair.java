package String_Programs;

public class _22SwapPair {
    public static void main(String[] args) {
        String str = "pratikz";
        getSwap(str);
    }
    public static void getSwap(String str){
        char ch[] = str.toCharArray();
        for(int i=0; i<str.length()-1; i+=2){
            char temp = ch[i];
            ch[i] = ch[i+1];
            ch[i+1] = temp;
        }
        System.out.println(ch);

    }
}
