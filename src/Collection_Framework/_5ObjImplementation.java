package Collection_Framework;

import java.util.ArrayList;

public class _5ObjImplementation extends _5Object{
    public static void main(String[] args) {
        Product p1 = new Product(1, "SUGAR",40);
        Product P2 = new Product(2, "RISE", 30);
        ArrayList<Object> obj = new ArrayList<>();
        obj.add(p1);
        obj.add(P2);
        for(Object a : obj){
            System.out.println(a);
        }

    }
}
