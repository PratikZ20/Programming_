package Collection_Framework;
import java.util.ArrayList;

public class _2Generic_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(10);
        data.add(30);
        data.add(1,40);
        data.set(1,50);
        System.out.println(data);
        System.out.println(data.get(1));
    }
}
