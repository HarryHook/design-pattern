package code.running.fun;

public class CompositePatternClient {
    public static void main(String[] args) {

        Folder DSFolder = new Folder("自学成才资料");

        File file1 = new File("深入理解 java 虚拟机");

        DSFolder.addComponent(file1);

        DSFolder.print();

        Folder subFolder = new Folder("五年高考三年模拟");

        File finalPaper = new File("组合模式.md");

        subFolder.addComponent(finalPaper);

        DSFolder.addComponent(subFolder);

        DSFolder.print();
    }
}
