package Star_Pattern;

public class Pattern {
//    public static void main(String[] args) {
//        int line = 5, star = 5;
//        for (int i = 0; i < line; i++) {
//            for (int j = 0; j < star; j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }
    //    *****
//        *****
//        *****
//        *****
//        *****
// ----------------------------------------------
//    public static void main(String[] args) {
//        int line = 5, star = 5, num = star;
//        for (int i = 0; i < line; i++) {
//            while (num != 0) {
//                System.out.print("* ");
//                num--;
//            }
//            System.out.println(" ");
//            num = star;
//        }
//
//    }
//
//             * * * * *
//             * * * * *
//             * * * * *
//             * * * * *
//             * * * * *
//
//------------------------------------------------------------------------------------

//    public static void main(String[] args) {
//        int line = 5, star = 5;
//        for(int i=1; i<line; i++){
//            for(int j=1; j<star; j++){
//                if (i==1 || j==1 || i==4 || j==4){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//        }
//
//
//****
//*  *
//*  *
//****
//
//
//
//    }
//--------------------------------------------------------------------------------
//    public static void main(String[] args) {
//        int line =6, star= 6;
//        for(int i=1; i<line; i++){
//            for(int j=1; j<star; j++){
//                if(i==1 || j==1 || i==5 || j==5 || i==3 && j==3){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print("_");
//                }
//            }
//            System.out.println(" ");
//        }
//    }
//
//
//            *****
//            *___*
//            *_*_*
//            *___*
//            *****

    //------------------------------------------------------------------------------------------------

//    public static void main(String[] args) {
//        int star=1, line = 5;
//        for(int i=0; i<line;  i++){
//            for(int j=0; j<star; j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//            star++;
//        }
//    }
//
//            *
//            **
//            ***
//            ****
//            *****
//--------------------------------------------------------------------------------
//    public static void main(String[] args) {
//        int star = 5, line = 5;
//        for(int i=0; i<line; i++){
//            for(int j=0; j<star; j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//            star--;
//        }
//    }
//            *****
//            ****
//            ***
//            **
//            *

    //----------------------------------------------------------------------------
//
//    public static void main(String[] args) {
//        int line = 9, star = 1;
//        for(int i=1; i<line; i++){
//            for(int j=1; j<star; j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//            if(i<5){
//                star++;
//            }
//            else {
//                star--;
//            }
//        }
//
//
//
//*
//**
//***
//****
//***
//**
//*
//    }
// -------------------------------------------------------------------------------
//    public static void main(String[] args) {
//        int line = 9, space = 5, star=1;
//        for (int i=0; i<line; i++){
//            for(int j=0; j<space; j++){
//                System.out.print(" ");
//            }
//            for(int k=0; k<star; k++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//            if(i<4){
//                star++;
//                space--;
//            }
//            else {
//                star--;
//                space++;
//            }
//        }
//    }
//     *
//    **
//   ***
//  ****
// *****
//  ****
//   ***
//    **
//     *
//-------------------------------------------------------------------
//    public static void main(String[] args) {
//        int star = 1, space = 5, line = 6;
//        for(int i=0; i<line; i++){
//            for(int j=0; j<space; j++){
//                System.out.print(" ");
//            }
//            for(int k= 0; k<star; k++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//            space--;
//            star++;
//        }
//    }
//
//                             *
//                            **
//                           ***
//                          ****
//                         *****
//                        ******
//---------------------------------------------------------------------------------------
//    public static void main(String[] args) {
//        int star=5, line = 5, space=0;
//        for (int i=0; i<line; i++){
//            for(int j=0; j<space; j++){
//                System.out.print(" ");
//            }
//            for(int k=0; k<star; k++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//            space++;
//            star--;
//        }
//    }
//           *****
//            ****
//             ***
//              **
//               *

    //----------------------------------------------------------------------------------
//
//public static void main(String[] args) {
//   int line = 11, star = 1, space = 5;
//   for(int i=0; i<line; i++){
//       for(int j=0; j<space; j++){
//           System.out.print(" ");
//       }
//       for(int k=0; k<star; k++){
//           System.out.print("*");
//       }
//       System.out.println(" ");
//       if (i<5){
//           star++;
//           space--;
//       }
//       else {
//           star--;
//           space++;
//       }
//   }
//}
    //----------------------------------------------------------
//                      *
//                     **
//                    ***
//                   ****
//                  *****
//                 ******
//                  *****
//                   ****
//                    ***
//                     **
//                      *
//    public static void main(String[] args){
//        int space =3, star= 1, line = 4;
//        for(int i=0; i<line; i++){
//            for (int j=0; j<space; j++){
//                System.out.print(" ");
//            }
//            for (int k=0; k<star; k++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//            star+=2;
//            space--;
//        }
//    }
//                     *
//                    ***
//                   *****
//                  *******
// -----------------------------------------------------------------------------

//    public static void main(String[] args) {
//        int star = 5, line = 5;
//        for (int i=0; i<=line; i++){
//            for(int j=0; j<=star; j++){
//                if(i==0 || j==0 || j==star){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//            star--;
//        }
//    }
//
//            ******
//            *   *
//            *  *
//            * *
//            **
//            *
// -----------------------------------------------------------------------------
//public static void main(String[] args) {
//    int line = 11, star=1;
//    for(int i=1; i<=line; i++){
//        for(int j=1; j<=star; j++){
//            if(j==1 || j==star){
//                System.out.print("*");
//            }
//            else {
//                System.out.print(" ");
//            }
//        }
//        System.out.println(" ");
//        if(i<=line/2){
//            star++;
//        }else {
//            star--;
//        }
//    }
//}
//        *
//        **
//        * *
//        *  *
//        *   *
//        *    *
//        *   *
//        *  *
//        * *
//        **
//        *
// ----------------------------------------------------------------------------
public static void main(String[] args) {
    int row = 5, col = 1, space = 2, newnum=1;
    for(int i=0; i<row; i++){
        for(int j=0; j<space; j++){
            System.out.print(" ");
        }
        int no=0;
        for(int k=0; k<col; k++){
            System.out.print(newnum);
            if(i<2){
                newnum+=no;
            }
            else {
                newnum = no;
            }
        }
        System.out.println(" ");
        if(i<row/2){
              col+=2;
              space--;

        }   else {
            space++;
             col-=2;
        }
    }
  }
}

