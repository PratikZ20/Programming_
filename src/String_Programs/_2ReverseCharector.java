//package String_Programs;
//public class _2ReverseCharector {
//    public static void main(String[] args) {
//        String s = "Pratik";
//        String rev = " ";
//        for(int i=s.length()-1; i>=0; i--)
//        {
//            char ch = s.charAt(i);
//            rev +=ch;
//        }
//        System.out.println(rev);
//    }
//
//}

package String_Programs;
public class _2ReverseCharector {
    public static void main(String[] args) {
        String name = "Pratik";
        String rever = " ";
        for(int i=name.length()-1; i>=0; i--){
            char ch = name.charAt(i);
            rever +=ch;
        }
        System.out.println(rever);
    }
}
