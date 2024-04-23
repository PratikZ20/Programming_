package J2ee;
public class LetterCount {
    public static void main(String[] args) {
        String input = "Hello good morning!";
        int[] letterCount = new int[26];
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                letterCount[ch - 'a']++;
            }
        }
        System.out.println("Letter Count:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = ch - 'a';
            if (letterCount[index] > 0) {
                System.out.println(ch + ": " + letterCount[index]);
            }
        }
    }
}

