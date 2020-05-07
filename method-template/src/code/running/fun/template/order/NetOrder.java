package code.running.fun.template.order;

public class NetOrder extends OrderProcessTemplate {

    @Override
    public void doSelect() {
        System.out.println("线上购物，加入购物车");
    }

    @Override
    public void doPayment() {
        System.out.println("进行线上支付");
    }

    @Override
    public void doDelivery() {
        System.out.println("根据收货地址进行邮寄");
    }
    
    @Override
    public boolean isGift() {
        return true;
    }
}