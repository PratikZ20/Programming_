package Number_Programs;
//121 == 1+1 = and 2 = are same then that number is xylem number.
public class _29XylemPholemNumber {
//    public static void main(String[] args) {
//        for(int num=1; num<=1000; num++){
//            getXylemPholemNum(num);
//        }
//    }
//    public static  void getXylemPholemNum(int num){
//        int temp = num;
//        int last = temp % 10;   //last
//        temp/=10;               //remove last
//        int mid = 0;
//        while (temp > 9){
//            int last2 = temp % 10;
//            mid +=last2;
//            temp/=10;
//        }
//        int firstlast = temp + last;
//        if(mid == firstlast){
//            System.out.println(num +" xylem number");
//        }
////
//
//    }
public static void main(String[] args) {
    int num= 121;
    getXylemPloem(num);
}
public static void getXylemPloem(int n){
    int temp = n;
    int last = temp % 10;
    temp/=10;
    int mid = 0;
    while (temp >9 ){
        int last2 = temp % 10;
        mid += last2;
        temp/=10;
    }
    int firstLast = temp + last;
    if(mid == firstLast){
        System.out.println(n+" Xylem Number");
    }
    else{
        System.out.println(n+" Ploem Number");
    }

}
}
