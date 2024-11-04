package ie.atu.week8;

import com.sun.jdi.connect.Connector;

public class Order {

    public Order()
    {

    }

    public static void main(String[] args) {


        String orderId;
        String customername;
        String productName;
        int[] quantity;

        customername = "Alvin";
        orderId = "1111";
        productName = "shirts";



        quantity = new int[10];

        quantity[0] = 1;
        quantity[1] = 2;
        quantity[2] = 3;
        quantity[3] = 4;
        quantity[4] = 5;
        quantity[5] = 6;
        quantity[6] = 7;
        quantity[7] = 8;
        quantity[8] = 9;
        quantity[9] = 10;

        System.out.println("Order objects");
        for (int i = 0; i < 1;)
        {
            System.out.println("",quantity);
                    i++;
        }


    }
}