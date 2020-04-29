package code.running.fun;

public class CellingFanChain {
    private State contextState;

    public void setContextState(State state) {
        contextState = state;
    }

    public CellingFanChain() {
        contextState = new Off();
    }

    public void pull() {
        contextState.pull(this);
    }
}
