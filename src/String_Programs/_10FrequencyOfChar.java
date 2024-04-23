package String_Programs;

public class _10FrequencyOfChar {
//    public static void main(String[] args) {
//        String s = "Entertainment".toLowerCase();
//        String collect = " ";
//        for(int i=0; i<s.length(); i++){
//            char k = s.charAt(i);
//            if(collect.indexOf(k)==-1){   //if the collect is empty then only it will count..
//                int count =0;
//                for(int j=0; j<s.length(); j++){
//                    char ch = s.charAt(j);
//                    if(ch==k){
//                        count++;
//                    }
//                }
//                collect +=k;
//                System.out.println(k+ " is repeated "+count+ " times");
//            }
//        }
//    }
//public static void main(String[] args) {
//    String str = "Entertainment".toLowerCase();
//    String collect = " ";
//    for(int i=0; i<str.length(); i++){
//        char ch = str.charAt(i);
//        if(collect.indexOf(ch)==-1){
//            int count = 0;
//            for(int j=0; j<str.length(); j++){
//                char k = str.charAt(j);
//                if(k==ch){
//                    count++;
//                }
//            }
//            collect +=ch;
//            System.out.println(ch +" is repeated "+ count + " times ");
//        }
//    }
//}

    public static void main(String[] args) {
        String str = "Entertainment".toLowerCase();
        String collect = " ";
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(collect.indexOf(ch)==-1){
                int count = 0;
                for(int j=0; j<str.length(); j++){

                    char k = str.charAt(j);
                    if(k==ch){
                        count++;
                    }
                }
                collect +=ch;
                System.out.println(ch+" is repeated "+count+ " times");
            }

        }

    }
}

