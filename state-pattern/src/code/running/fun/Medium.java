package code.running.fun;

public class Medium implements State {
    @Override
    public void pull(CellingFanChain cellingFanChain) {
        System.out.println("\t high speed");
        cellingFanChain.setContextState(new High());
    }
}
