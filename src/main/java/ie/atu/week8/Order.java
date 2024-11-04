package ie.atu.week8;
import java.util.ArrayList;
import com.sun.jdi.connect.Connector;

public class Order {

    public Order()
    {

    }

    public static void main(String[] args) {


        String orderId;
        String customername;
        String productName;
       int[] object;
       object = new int[10];
       ArrayList<Integer> objects = new ArrayList<>();

        customername = "Alvin";
        orderId = "1111";
        productName = "shirts";

      objects.add(Integer.valueOf("1"));
        objects.add(Integer.valueOf("2"));
        objects.add(Integer.valueOf("3"));
        objects.add(Integer.valueOf("4"));
        objects.add(Integer.valueOf("5"));
        objects.add(Integer.valueOf("6"));
        objects.add(Integer.valueOf("7"));
        objects.add(Integer.valueOf("8"));
        objects.add(Integer.valueOf("9"));





        System.out.println("Order objects");




    }
}