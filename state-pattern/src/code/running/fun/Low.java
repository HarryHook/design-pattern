package code.running.fun;

public class Low implements State {
    @Override
    public void pull(CellingFanChain cellingFanChain) {
        System.out.println("\t medium speed");
        cellingFanChain.setContextState(new Medium());
    }
}
