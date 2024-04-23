package String_Programs;

public class _11PrintDuplicates {
//    public static void main(String[] args) {
//        String s = "Pratikkk";
//        String empty = " ";
//        for(int i=0; i<s.length(); i++){
//            char ch = s.charAt(i);
//            if(empty.indexOf(ch)==-1){
//                int count = 0;
//                for(int j=0; j<s.length(); j++){
//                    char k = s.charAt(j);
//                    if(k==ch){
//                        count++;
//                    }
//                }
//                if(count>1){
//                    empty +=ch;
//                }
//            }
//        }
//        System.out.println(empty);
//    }
//public static void main(String[] args) {
//    String s = "Pratikkk";
//    String  store = " ";
//    for(int i=0; i<s.length(); i++){
//        char ch = s.charAt(i);
//        if(store.indexOf(ch)==-1){
//            int count = 0;
//            for(int j=0; j<s.length(); j++){
//                char k = s.charAt(j);
//                if(k==ch){
//                    count++;
//                }
//            }
//            if(count>1){
//                store+=ch;
//            }
//        }
//    }
//    System.out.println(store);
//}
public static void main(String[] args) {
    String name = "Pratikkk";
    String repeat = "";
    for(int i=0; i<name.length(); i++){
        char ch = name.charAt(i);
        if(repeat.indexOf(ch)==-1){
            int count = 0;
            for(int j=0; j<name.length(); j++){
                char k = name.charAt(j);
                if(ch==k){
                    count++;
                }
            }
            if(count>1){
                repeat+=ch;

            }
        }
    }
    System.out.println(repeat);
}
}
