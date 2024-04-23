package Star_Programs_2;

public class _1Piryamid {
//    public static void main(String[] args) {
//        int n = 5, space = n-1, star = 1;
//        for(int i=1; i<n; i++){
//            for(int j=1; j<=space; j++){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=star; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//            star+=2;
//            space--;
//        }
//    }
//                  *
//                 ***
//                *****
//               *******
    //-------------------------------------------------------------------------------------------------
//public static void main(String[] args) {
//    int n = 9, star = n, space =0;
//    for(int i=1; i<=n; i++){
//        for(int j=1; j<=space; j++){
//            System.out.print(" ");
//        }
//        for(int k=1; k<=star; k++){
//            System.out.print("*");
//        }
//        System.out.println();
//        star-=2;
//        space++;
//    }
//}
//        *********
//         *******
//          *****
//           ***
//            *
    //----------------------------------------------------------------------------
//public static void main(String[] args) {
//    int n=9, star=1;
//    for(int  i=1; i<=n; i++){
//        for(int j=1; j<=star; j++){
//            System.out.print("*");
//        }
//        System.out.println();
//        if(i<=n/2){
//            star++;
//        }else {
//            star--;
//        }
//
//    }
//}
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *
//public static void main(String[] args) {
//
//        int n=9, star=1, space = n-1;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=space; j++){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=star; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//            if(i<=n/2){
//                star++;
//                space--;
//            }else{
//                star--;
//                space++;
//            }
//        }
//
//
//}
//
//}
////               *
//                **
//               ***
//              ****
//             *****
//              ****
//               ***
//                **
//                 *
//-------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
    int n = 9;
    int n2 = 9;
        System.out.println(first(n2)+second(n));
    }
    public static int second(int n){
        int star=1, space = n-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=star; k++){
                System.out.print("*");
            }
            System.out.println();
            if(i<=n/2){
                star++;
                space--;
            }else{
                star--;
                space++;
            }
        }
        return star;
    }
    public static int first(int n){
        int  star=1;
        for(int  i=1; i<=n; i++){
            for(int j=1; j<=star; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<=n/2){
                star++;
            }else {
                star--;
            }

        }
        return star;
    }
}