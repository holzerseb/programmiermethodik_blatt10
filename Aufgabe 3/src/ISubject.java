/**
 * Created by user on 19.06.2017.
 */
public interface ISubject
{
    void register(AbstractObserver observer);
    void unregister(AbstractObserver observer);
    void notifyObservers();
}
