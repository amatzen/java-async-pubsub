package dk.alexander.javaAsyncPubsub;

public interface Observer {
    public void notify(Object payload);
}
