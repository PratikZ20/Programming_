package String_Programs;

public class _14StringPanagram {
    public static void main(String[] args) {
        String s = "abb";
        if(getPanagram(s)){
            System.out.println("Panagram");
        }
        else{
            System.out.println("Not an Panagram");
        }
    }
    public static boolean getPanagram(String s){
        for(char ch = 'a'; ch<='z'; ch++){
            if(s.indexOf(ch)==-1)
                return false;
        }
        return true;
    }

}
