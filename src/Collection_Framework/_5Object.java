package Collection_Framework;

import java.util.ArrayList;

public class _5Object {
    static class Product{
        private int productId;
        private String productName;
        private double  productPrice;

        Product(int productId, String productName, double productPrice){
            this.productId=productId;
            this.productName=productName;
            this.productPrice=productPrice;
        }
//        @Override
//        public String toString(){
//
//        }

        @Override
        public String toString() {
            return "Product{" +
                    "productId=" + productId +
                    ", productName='" + productName + '\'' +
                    ", productPrice=" + productPrice +
                    '}';
        }
    }

}
