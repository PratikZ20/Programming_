package Number_Programs;

public class _36PerfectSquare {
    public static void main(String[] args) {
        double num = 16;
        if (getPerfectSquare(num))
            System.out.println(num+ " is a perfect square number");
    }
    public static boolean getPerfectSquare(double n){
        double square = Math.sqrt(n);
        return (square - Math.floor(square)==0);
    }
}
