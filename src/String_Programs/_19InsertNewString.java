package String_Programs;

public class _19InsertNewString {
    public static void main(String[] args) {
        String str = "geeksgeeks";
        String enterString = "for";
        int index = 4;
        String  s = addString(str, enterString, index);
        System.out.println(s);
    }
    public static String addString(String str, String enterStr, int index){
        String newString = str.substring(0, index+1) + enterStr + str.substring(index+1);
        return newString;
    }
}
