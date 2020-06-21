package code.running.fun.decorator;

import code.running.fun.Quackable;
import code.running.fun.observer.Observable;
import code.running.fun.observer.Observer;

public class QuackCounter implements Quackable {
    private Quackable duck;
    private static int numberOfQuacks;

    Observable observable;


    public QuackCounter(Quackable duck) {
        this.duck = duck;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        duck.quack();
        notifyObservers();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
