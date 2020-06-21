package code.running.fun.factory;

import code.running.fun.Quackable;
import code.running.fun.adapter.GooseAdapter;
import code.running.fun.goose.Goose;

public class GooseFactory extends AbstractGooseFactory {
    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}
