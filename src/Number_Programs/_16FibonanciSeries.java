package Number_Programs;

public class _16FibonanciSeries {
    public static void main(String[] args) {
//        int num1 = 0, num2 = 1;
//        System.out.print(num1+","+num2+",");
//        for(int i=0; i<=5; i++){
//            int temp = num1 + num2;
//            num1 = num2;
//            num2 = temp;
//            System.out.print(temp+",");
//        }
        int num1 = 0, num2 = 1;
        System.out.print(num1+","+num2+",");
        for(int i=0; i<5; i++){
            int next = num1+num2;
            num1 = num2;
            num2 = next;
            System.out.print(next+",");
        }

    }
}
