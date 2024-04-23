package Star_Programs_2;

public class _4HollowDiamond {
//    public static void main(String[] args) {
//        int n = 7, star = 1, space = n/2;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=space; j++){
//                System.out.print(" ");
//            }
//            for (int k = 1; k<=star; k++){
//                if (k==1 || k==star){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//            if(i<=n/2){
//                star+=2;
//                space--;
//            }
//            else {
//                star-=2;
//                space++;
//            }
//        }
//    }
//                   *
//                  * *
//                 *   *
//                *     *
//                 *   *
//                  * *
//                   *

    //---------------------------------------------------------------------------------------------------------------------------
     public static void main(String[] args) {
        int n = 7, star = 1, space = n/2;
        for(int i=1; i<=n; i++){
            if(space != -1){
                for(int j=1; j<=space; j++){
                    System.out.print("*");
                }
            }

            for (int k = 1; k<=star; k++){
                if (k==1 || k==star){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
            if(i<=n/2){
                star+=2;
                space--;
            }
            else {
                star-=2;
                space++;
            }
        }
    }
//            ****
//            *** *
//            **   *
//            *     *
//            **   *
//            *** *
//            ****
}
