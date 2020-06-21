package code.running.fun.factory;

import code.running.fun.Quackable;
import code.running.fun.duck.DuckCall;
import code.running.fun.duck.MallardDuck;
import code.running.fun.duck.RedheadDuck;
import code.running.fun.duck.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
