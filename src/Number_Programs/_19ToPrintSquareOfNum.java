package Number_Programs;

public class _19ToPrintSquareOfNum {
    public static void main(String[] args) {
        int num = 16;
        for(int i=1;true; i++){
            if(i*i==num){
                System.out.println(i+ " is a square of "+ num);
                break;
            }
            else if(i*i > num) {
                System.out.println(i + " is not a square of " + num);
                break;
            }
        }
    }
}
