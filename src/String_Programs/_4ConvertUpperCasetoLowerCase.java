//package String_Programs;
//
//public class _4ConvertUpperCasetoLowerCase {
//    public static void main(String[] args) {
//        String s = "BGN6756@an$AJsBeaUSatiFULL";
//        String temp = " ";
//        for(int i=0;i<s.length(); i++){
//            char ch = s.charAt(i);
//            if(ch >= 'A' && ch <='Z')
//            {
//                temp += (char)(ch+32);
//            }
//            else if(ch>='a' && ch<='z') {
//                temp += (char)(ch-32);
//            }else
//                temp +=ch;
//        }
//        System.out.println(temp);
//    }
//}

package String_Programs;
public class _4ConvertUpperCasetoLowerCase {
    public static void main(String[] args) {
        String s = "8288ANNDxn%88";
        String temp = " ";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch <='Z'){
                temp +=(char)(ch+32);
            }
            else if(ch>='a' && ch<='z'){
                temp +=(char)(ch-32);
            }
            else{
                temp+=ch;
            }
        }
        System.out.println(temp);
    }
}
