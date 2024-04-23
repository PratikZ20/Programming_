package String_Programs;

public class _23StringWordReverse {
    public static void main(String[] args) {
        String name = "I love programming";

        String [] str = name.split(" ");

        StringBuilder ans = new StringBuilder();
        for(int i=str.length-1; i>=0; i--){
            ans.append(str[i]);
            if(i>0){
                ans.append(" ");
            }
        }
        System.out.println("Normal String :"+name);
        System.out.println("Reversed : "+ans.toString());
    }
}
