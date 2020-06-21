package code.running.fun.factory;

import code.running.fun.Quackable;
import code.running.fun.adapter.GooseAdapter;
import code.running.fun.decorator.QuackCounter;
import code.running.fun.goose.Goose;

public class CountingGooseFactory extends AbstractGooseFactory {
    @Override
    public Quackable createGoose() {
        return new QuackCounter(new GooseAdapter(new Goose()));
    }
}
