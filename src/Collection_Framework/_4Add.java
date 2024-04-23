package Collection_Framework;


import java.util.ArrayList;

public class _4Add {
    public static void main(String[] args) {
        ArrayList<String > data1 = new ArrayList<>();
        data1.add("Pragati");
        data1.add("Java");
        data1.add("SQL");
//        System.out.println(data1);
        ArrayList<String > data2 = new ArrayList<>();
        data2.add("Pratik");
        data2.add("Ayush");
        data2.add("Aryan");
        data1.addAll(data2);
        System.out.println(data1);

    }
}
