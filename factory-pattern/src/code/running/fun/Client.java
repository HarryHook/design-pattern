package code.running.fun;

/**
 * @author chenhaowei
 * @date 2020.05.29
 */
public class Client {

    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.getShape("rectangle");
        Shape square = ShapeFactory.getShape("square");
    }
}
