package code.running.fun;

/**
 * @author chenhaowei
 * @date 2020.05.29
 */
public class ShapeFactory {

    public static Shape getShape(String shapeName) {
        if(shapeName == null) {
            return null;
        }
        if(shapeName.equals("rectangle")) {
            return new Rectangle();
        } else if(shapeName.equals("square")) {
            return new Square();
        }
        return null;
    }
}
