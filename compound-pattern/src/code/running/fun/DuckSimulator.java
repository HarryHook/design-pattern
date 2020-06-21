package code.running.fun;

import code.running.fun.collection.Flock;
import code.running.fun.decorator.QuackCounter;
import code.running.fun.factory.AbstractDuckFactory;
import code.running.fun.factory.AbstractGooseFactory;
import code.running.fun.factory.CountingDuckFactory;
import code.running.fun.factory.CountingGooseFactory;
import code.running.fun.observer.Quackologist;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();

        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();

        duckSimulator.simulate(countingDuckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        AbstractGooseFactory countGooseFactory = new CountingGooseFactory();

        Flock flockOfDucks = new Flock();

        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);

        Quackable goose = countGooseFactory.createGoose();

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: With Observer");
        Quackologist quackologist = new Quackologist();
        goose.registerObserver(quackologist);

        System.out.println("\nDuck Simulator: Whole Flock Simulation \n");
        simulate(flockOfDucks);

        System.out.println("\nDuck Simulator: Whole Mallard Flock Simulation \n");
        simulate(flockOfMallards);

        System.out.println("\nDuck Simulator: Goose Simulation \n");
        simulate(goose);


        System.out.println("\nthe duck quacked " + QuackCounter.getQuacks() + " times");

    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
