package code.running.fun.template.order;

public class MethodPatternClient {
    public static void main(String[] args) {
        OrderProcessTemplate netOrder = new NetOrder();
        netOrder.processOrder();

        System.out.println("=======================");

        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }
}
