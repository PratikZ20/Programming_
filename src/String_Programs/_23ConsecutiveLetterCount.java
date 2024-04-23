package String_Programs;

public class _23ConsecutiveLetterCount {
    public static void main(String[] args) {
        String str = "successive";
        char prevChar = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (currChar == prevChar) {
                count++;
            } else {
                if (count > 1) {
                    System.out.print("['" + prevChar + "', " + count + "] ");
                }
                prevChar = currChar;
                count = 1;
            }
        }
        // Print the last character and its count if consecutive
        if (count > 1) {
            System.out.print("['" + prevChar + "', " + count + "]");
        }
    }
}
