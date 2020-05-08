package code.running.fun;

public class File extends Component {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("file name: " + name);
    }
}
