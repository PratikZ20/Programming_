package String_Programs;

public class _25StringToNumber {
    public static void main(String[] args) {
        String[] ones = {"", "one", "two", "three", "four", "five", "Six", "Seven", "Eight", "Nine", "Eleven", "Twell", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String hun = "hundred";
        String thou = "thousand";
        int n = 10453, temp = n;
        String word = " ";
        int count = 1;
        if(temp % 100 < 20) // if last two digit is from 10 to 20
        {
            word +=word +" "+ones[temp%100];
            temp/=100;
            count=3;
        }
        while (temp != 0) {
            int last = temp % 10;
            if (count == 1) {
                word += "  " + ones[last];
            } else if (count == 2) {
                word = " " + tens[last] + word;
            } else if (count == 3) {
                if (last != 0) //3rd digit is 0 means it is not pronounces as 100
                    word = " " + ones[last] + " " + hun + word;
            } else if (count == 4) {
                if (temp < 20 && last != 0) {
                    word = " " + ones[last] + " " + thou + word;
                    break;
                } else
                    word = " " + ones[last] + " " + thou + word;
            } else if (count == 5)
                word = tens[last] = word;
            count++;
            temp /= 10;
        }
        System.out.println(word.trim());
    }
}



//        public static void main(String[] args) {
//            String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
//            String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
//            String hun = "hundred";
//            String thou = "thousand";
//            int n = 10453, temp = n;
//            String word = "";
//            int count = 1;
//            while (temp != 0) {
//                int last = temp % 10;
//                if (count == 1) {
//                    word = ones[last] + word;
//                } else if (count == 2) {
//                    if (last != 0) {
//                        word = tens[last] + " " + word;
//                    }
//                } else if (count == 3) {
//                    if (last != 0) {
//                        word = ones[last] + " " + hun + " " + word;
//                    }
//                } else if (count == 4) {
//                    if (last != 0) {
//                        word = ones[last] + " " + thou + " " + word;
//                    }
//                }
//                else if(count == 5){
//                    if(temp < 10 ){
//                        word = ones[last] + tens[last]+" "+ thou +" " +word;
//                    }
//                }
//                count++;
//                temp /= 10;
//            }
//            System.out.println(word.trim());
//        }
//}




