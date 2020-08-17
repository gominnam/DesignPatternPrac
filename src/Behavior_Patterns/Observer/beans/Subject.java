package Behavior_Patterns.Observer.beans;

public interface Subject {
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers();
}
