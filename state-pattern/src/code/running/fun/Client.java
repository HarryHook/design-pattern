package code.running.fun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) {

        CellingFanChain1 cellingFanChain = new CellingFanChain1();

        while (true) {
            System.out.print("Press ENTER");
            nextPull();
            cellingFanChain.pull();
        }
    }

    static String nextPull() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }
}
