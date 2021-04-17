package dk.alexander.javaAsyncPubsub;

public interface Subject {
    public void subscribe(Observer observer);
    public void unsubscribe(Observer observer);
    public void publish(Object payload);
}
