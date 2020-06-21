package code.running.fun;

import code.running.fun.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}
