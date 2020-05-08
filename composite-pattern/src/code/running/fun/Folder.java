package code.running.fun;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

    private String name;
    private List<Component> componentList = new ArrayList<Component>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("fold name: " + this.name);

        for (Component component : componentList) {
            component.print();
        }
    }

    public void addComponent(Component component) {
        componentList.add(component);
    }

    public void remove(Component component) {
        if (componentList.contains(component)) {
            componentList.remove(component);
        }
    }

}
