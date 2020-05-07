package code.running.fun.template.order;

public class StoreOrder extends OrderProcessTemplate {

    @Override
    public void doSelect() {
        System.out.println("顾客线下进行选购");
    }

    @Override
    public void doPayment() {
        System.out.println("顾客线下进行支付，刷卡/现金结算");
    }

    @Override
    public void doDelivery() {
        System.out.println("物品已送至柜台");
    }
}