package String_Programs;

public class _17PrintEvenChar {
    public static void main(String[] args) {
        String str = "Pratik";
        char ch[] = str.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(i%2==0){
                System.out.println(ch[i]);
            }
        }
    }
}
