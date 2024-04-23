package CharectorPattern;

public class Program {
//    public static void main(String[] args) {
//        int n = 5;
//        char ch ='A';
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                if(i>=j)
//                    System.out.print(ch);
//                else
//                    System.out.print(" ");
//            }
//            System.out.println(" ");
//            ch++;
//        }
//    }
//            A
//            BB
//            CCC
//            DDDD
//            EEEEE

    //-----------------------------------------------------------------------------------
//    public static void main(String[] args) {
//        int n = 5;
//        char ch = 'A';
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                if(i>=j)
//                    System.out.print(ch++);
//                else
//                    System.out.print(" ");
//            }
//            System.out.println(" ");
//
//        }
//    }
//            A
//            BC
//            DEF
//            GHIJ
//            KLMNO

    //-----------------------------------------------------------------------------------------
//    public static void main(String[] args) {
//
//        int n = 5;
//        char ch = 'A';
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                if(i>=j)
//                    if(i==j) {
//                        System.out.print(ch++);
//                    }
//                     else {
//                        System.out.print(j);
//                    }
//                     else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//
//        }
//    }
//A
//1B
//12C
//123D
//1234E
    //-------------------------------------------------------------------------------
//    public static void main(String[] args) {
//        int n = 5;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                if(i>=j)
//                {
//                    if(j%2==0)
//                    {
//                        System.out.print("0");
//                    }else{
//                        System.out.print("1");
//                    }
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//        }
//    }
//            1
//            10
//            101
//            1010
//            10101
    //---------------------------------------------------------------------------------
//    public static void main(String[] args) {
//        int n = 11, space = n/2, no = 1;
//
//        for(int i=1; i<=n; i++){
//            char ch = 'A';
//            for(int j=1; j<=space; j++){
//                System.out.print(" ");
//            }
//
//            for(int k =1; k<=no; k++){
//                if(k==1 || k==no ){
//                    System.out.print("1");
//                }else {
//                    System.out.print(ch++);
//
//                }

//            }
//            System.out.println(" ");
//
//            if(i<=n/2){
//                no+=2;
//                space--;
//            }else {
//                no-=2;
//                space++;
//            }
//        }
//    }
//     1
//    1A1
//   1ABC1
//  1ABCDE1
// 1ABCDEFG1
//1ABCDEFGHI1
// 1ABCDEFG1
//  1ABCDE1
//   1ABC1
//    1A1
//     1

    //-----------------------------------------------------
        public static void main(String[] args) {
        int n = 11, space = n/2, no = 1;

        for(int i=1; i<=n; i++){
            char ch = 'A'; int temp = 1;
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }

            for(int k =1; k<=no; k++){
                if(k==1 || k==no ){
                    System.out.print(ch);
                }else {
                    System.out.print(temp++);
                }
                ch++;

            }
            System.out.println(" ");

            if(i<=n/2){
                no+=2;
                space--;
            }else {
                no-=2;
                space++;
            }
        }
    }
//     A
//    A1C
//   A123E
//  A12345G
// A1234567I
//A123456789K
// A1234567I
//  A12345G
//   A123E
//    A1C
//     A
    //---------------------------------------------------------------------------------
}

