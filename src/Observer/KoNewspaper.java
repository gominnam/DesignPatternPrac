package Observer;

import java.util.ArrayList;
import java.util.List;

public class KoNewspaper implements Article{
    private String message;
    private List<Subscriber> subscribers = new ArrayList<>();
    private int total = 0;

    @Override
    public void attach(Subscriber subscriber) {
        subscribers.add(subscriber);
        total++;
    }

    @Override
    public void detach(Subscriber subscriber) {
        subscribers.remove(subscriber);
        total--;
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        notifySubscribers();
    }
}
/*

*/