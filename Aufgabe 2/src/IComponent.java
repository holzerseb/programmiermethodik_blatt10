import java.util.Date;

/**
 * This defines the Component itself
 */
public abstract class IComponent
{
    protected String path;
    protected String name;
    protected Date createdDate; //we assume, the created time = time when the object is initialized

    abstract void print();
    abstract String getPath();


    /* Default Methods */
    protected void setPath(String path) { this.path = path; }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Date getCreatedDate()
    {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate)
    {
        this.createdDate = createdDate;
    }
}
