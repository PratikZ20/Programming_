package String_Programs;

public class _9CountCharFromString {
    public static void main(String[] args) {
        String s = "Pratik";
        char ch = 'P';
        int count =0;
        for(int i=0; i<s.length(); i++){
            char k = s.charAt(i);
            if(k==ch){
                count++;
            }
        }
        System.out.println(count);

    }
}
