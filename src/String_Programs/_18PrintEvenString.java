package String_Programs;

public class _18PrintEvenString {
    public static void main(String[] args) {
        String str = "I AM GEEKS FOR GEEKS AND A GEEK";
        printEvenWord(str);
    }
    public static void printEvenWord(String s){
        String word [] = s.split(" ");
        int letterCount [] = new int[word.length];
        for(int i=0; i<word.length; i++){
            letterCount[i] = word[i].length();
        }
        for(int j=0; j<word.length; j++){
            if(letterCount[j] % 2 == 0 ){
                System.out.println(word[j]);
            }
        }
    }

}
