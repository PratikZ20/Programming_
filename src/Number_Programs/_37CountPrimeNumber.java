package Number_Programs;

public class _37CountPrimeNumber {
    public static void main(String[] args) {
        int connt=0;
      for(int i=2; i<=50; i++){
          if(getPrimeNumber(i))
              connt++;
      }
        System.out.println(connt);
    }
    public static boolean  getPrimeNumber(int num){
        if(num<=1)
            return false;
        for(int i=2; i<=num/2; i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
