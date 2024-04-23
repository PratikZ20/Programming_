package Star_Programs_2;

public class _3ReverseHollowTraingle {
    public static void main(String[] args) {
        int n = 6, star = (n*2)-1, space =0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=star; k++){
                if(i==1 || k==1 || k==star)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
            space++;
            star-=2;
        }
    }
//            ***********
//             *       *
//              *     *
//               *   *
//                * *
//                 *

}
