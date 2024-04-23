package Number_Pattern;

public class NumberProgram {
//    public static void main(String[] args) {
//    int row=5, col=5;
//    for(int i=0; i<row; i++){
//        int temp = 5;
//        for(int j=0; j<col; j++){
//            if(j%2 !=0){
//                System.out.print("*");
//            }else{
//                System.out.print(temp--);
//            }
//        }
//        System.out.println(" ");
//        col--;
//    }
//    }
//            5*4*3
//            5*4*
//            5*4
//            5*
//            5
//-------------------------------------------------------------------------------------------------
//    public static void main(String[] args) {
//        int row=5, col=5;
//        char ch = 'E';
//        for(int i=0; i<row; i++){
//            char  temp = ch;
//            for(int j=0; j<col; j++){
//                System.out.print(temp);
//                temp--;
//            }
//            System.out.println(" ");
//            col--;
//            ch--;
//        }
//    }
//            EDCBA
//            DCBA
//            CBA
//            BA
//            A
    //--------------------------------------------------------------------------------------
//public static void main(String[] args) {
//    int row = 5, col = 5;
//    int b=1;
//        while (b<=row){
//            int fno =0, sno = 1, j=1;
//            while (j<=col){
//                System.out.print(fno);
//                int output = fno + sno;
//                fno = sno;
//                sno = output;
//                j++;
//            }
//            System.out.println(" ");
//            col--;
//            b++;
//        }
//}
//        01123
//        0112
//        011
//        01
//        0

//    public static void main(String[] args) {
//        int row= 7,col=1;
//        for(int i=1; i<=row; i++){
//            char ch = 'A';
//            for(int j=1; j<=col; j++){
//                if(j==1 || j==col){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(ch++);
//                }
//            }
//            System.out.println(" ");
//            if(i<=row/2){
//                col++;
//            }
//            else {
//                col--;
//            }
//        }
//    }
//            *
//            **
//            *A*
//            *AB*
//            *A*
//            **
//            *
    //-----------------------------------------------------------------------------------------
//public static void main(String[] args) {
//    int row  = 7, col =1, diff=5,no=1;
//    for(int i=1; i<=row; i++){
//        int temp = no;
//        int temp1 = diff;
//        for(int j=1; j<=col; j++){
//            System.out.print(temp);
//            temp-=temp1;    //-4
//            temp1--;        //-4
//        }
//        System.out.println(" ");
//        no +=diff;
//        diff--;
//        if(i<=row/2){
//            col++;
//        }
//        else {
//            col--;
//        }
//    }
// }
//         1
//         62
//         1075
//         13111010
//         151414
//         1616
//         16
// -----------------------------------------------------------------------------------
//public static void main(String[] args) {
//    int row=7, col=1;
//    char ch = 'A';
//    for(int i=0; i<row; i++){
//        for(int j=0; j<col; j++){
//            System.out.print(ch);
////            ch++;
//        }
//        System.out.println(" ");
//        ch++;
//        if(i<row/2){
//            col++;
//        }
//        else{
//            col--;
//        }
//    }
//}
//            A
//            BB
//            CCC
//            DDDD
//            EEE
//            FF
//            G
// ------------------------------------------------------------------------------
//    public static void main(String[] args) {
//        int row=5, col=1, space=4;
//        for(int i=1; i<=row; i++){
//            for(int j=1; j<=space; j++){
//                System.out.print(" ");
//            }
//            char ch = 'A';
//            int no=1;
//            for(int k=1; k<=col; k++){
//                if(i%2==1){
//                    System.out.print(ch++);
//                }else {
//                    System.out.print(no++);
//                }
//            }
//            System.out.println(" ");
//            space--;
//            col++;
//        }
//    }
//       A
//      12
//      ABC
//     1234
//    ABCDE

    //------------------------------------------------------------------------------------------
//    public static void main(String[] args) {
//        int row=5, col=1, num =5, diff=8;
//        for(int i=1; i<=row; i++){
//            int temp = num ,tempdiff=diff;
//            for(int j=1; j<=col; j++){
//                System.out.print(temp);
//                temp +=tempdiff;
//                temp--;
//            }
//            System.out.println(" ");
//            num--;
//            col++;   //2 -->7+4=11-1= (10);
//            diff--;
//        }
//    }
//            5
//            410
//            3813
//            261014
//            1471013

    //------------------------------------------------------------------------
//    public static void main(String[] args) {
//        int num = 5, col=1, no=5, diff=6 ;
//        for(int i=1; i<=num; i++){
//            int temp = no;
//            for(int j=1; j<=col; j++){
//                System.out.print(temp);
//                temp+=diff;
//            }
//            System.out.println(" ");
//            no--;
//            col++;
//            diff--;
//        }
//        5
//        49
//        3711
//        25811
//        13579

    //-----------------------------------------------------------------------------
////    }
//     public static void main(String[] args) {
//        int row = 6, col=5;
//        for(int i=1; i<=row; i++){
//            for(int j=1; j<=col; j++){
//                System.out.print("*");
//            }
//            System.out.print(col);
//            System.out.println(" ");
//            col--;
//
//        }
//
//    }
//            *****5
//            ****4
//            ***3
//            **2
//            *1
//            0


}
