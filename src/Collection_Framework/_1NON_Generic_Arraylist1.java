package Collection_Framework;
import java.util.ArrayList;

public class _1NON_Generic_Arraylist1 {
    public static void main(String[] args) {
        //this is an non generic array list
        ArrayList data = new ArrayList();
        data.add(10);
        data.add(20);
        data.add(40.2);
        data.add("Pratik");
        data.add(false);
        System.out.println(data);
        data.remove(0);
        System.out.println(data);
        data.remove(2);
        System.out.println(data);
    }
}
