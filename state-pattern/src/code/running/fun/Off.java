package code.running.fun;

public class Off implements State {
    @Override
    public void pull(CellingFanChain cellingFanChain) {
        System.out.println("\t low speed");
        cellingFanChain.setContextState(new Low());
    }
}
