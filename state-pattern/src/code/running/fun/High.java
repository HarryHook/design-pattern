package code.running.fun;

public class High implements State {
    @Override
    public void pull(CellingFanChain cellingFanChain) {
        System.out.println("\t turning off");
        cellingFanChain.setContextState(new Off());
    }
}
