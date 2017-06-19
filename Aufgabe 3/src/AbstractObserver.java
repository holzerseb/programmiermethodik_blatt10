/**
 * Created by user on 19.06.2017.
 */
public abstract class AbstractObserver
{
    protected ISubject subject;
    abstract void update();
    abstract void remove();
}
