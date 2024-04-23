package String_Programs;

import java.util.Arrays;

class _13StringAnagram{
    public static void main(String[] args) {
        String str1 = "Listen";
        String ste2 = "Silent";
        if(getString(str1, ste2)){
            System.out.println("String Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }

    }
    public static boolean getString(String str1, String str2){
        if(str1.length()==str2.length()){
            char ch1[] = str1.toLowerCase().toCharArray();
            Arrays.sort(ch1);
            char ch2[] = str2.toLowerCase().toCharArray();
            Arrays.sort(ch2);
            for(int i=0; i<str1.length(); i++){
                if(ch1[i]!=ch2[i])
                {
                    return false;
                }
            }
        }
        return true;
    }
}




