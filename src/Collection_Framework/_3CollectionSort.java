package Collection_Framework;
import java.util.ArrayList;

import java.util.Collections;

public class _3CollectionSort {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Pratik");
        data.add("kzyus");
        data.add("Aryana");
//        data.add(60);
//        data.add(1);
//        data.add(2);
        System.out.println(data);
        System.out.println("______________________");
        //now we can perform the sorting the sorting  of an values.
        Collections.sort(data);
        System.out.println(data);
        //now we can also perfonm the reverse order of it value
        System.out.println("----------------------");
        Collections.sort(data,Collections.reverseOrder());
        System.out.println(data);
    }
}
