package code.running.fun.factory;

import code.running.fun.Quackable;
import code.running.fun.decorator.QuackCounter;
import code.running.fun.duck.DuckCall;
import code.running.fun.duck.MallardDuck;
import code.running.fun.duck.RedheadDuck;
import code.running.fun.duck.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
