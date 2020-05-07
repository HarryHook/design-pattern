package code.running.fun.template.order;

public abstract class OrderProcessTemplate {

    private boolean isGift;

    public OrderProcessTemplate() {
        isGift = isGift();
    }

    // 通用方法
    private void giftWrap() {
        System.out.println("给礼品进行包装");
    }

    // 交给子类扩展的方法
    protected abstract void doSelect();

    // 交给子类扩展的方法
    protected abstract void doPayment();

    // 交给子类扩展的方法
    protected abstract void doDelivery();

    // hook method
    protected boolean isGift() {
        return false;
    }

    // 定义的模板方法，设计具体的逻辑
    public final void processOrder() {
        doSelect();
        doPayment();
        if (isGift) {
            giftWrap();
        }
        doDelivery();
    }
}