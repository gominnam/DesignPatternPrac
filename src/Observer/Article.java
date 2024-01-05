package Observer;

public interface Article {
    void attach(Subscriber subscriber);
    void detach(Subscriber subscriber);
    void notifySubscribers();
}
