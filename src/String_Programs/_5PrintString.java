package String_Programs;

public class _5PrintString {
    public static void main(String[] args) {
        String name = "Pratik is my name";
        String str[] = name.split(" ");
        for(int i=0; i<str.length; i++){
            System.out.println(str[i]);
        }
    }
}
