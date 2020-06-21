package code.running.fun.adapter;

import code.running.fun.Quackable;
import code.running.fun.goose.Goose;
import code.running.fun.observer.Observable;
import code.running.fun.observer.Observer;

public class GooseAdapter implements Quackable {
    Goose goose;

    Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
        notifyObservers();
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
