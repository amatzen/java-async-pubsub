package dk.alexander.javaAsyncPubsub;

import java.util.ArrayList;
import java.util.List;

public class SampleSubject implements Subject {
    List<Observer> observers = new ArrayList<>();

    @Override
    public synchronized void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public synchronized void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void publish(Object payload) {
        observers.forEach(observer -> observer.notify(payload));
    }
}
