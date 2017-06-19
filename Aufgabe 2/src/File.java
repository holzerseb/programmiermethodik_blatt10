import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by user on 19.06.2017.
 */
public class File extends IComponent
{
    public File(String name)
    {
        this.setName(name);
        this.setCreatedDate(new Date());
        this.path = "/";
    }

    @Override
    void print()
    {
        System.out.println("[FILE] This file is called \""+ getName() + "\" and was created on " + getCreatedDate().toString() + "\" and is located at: \"" + getPath() + "\"");
    }

    @Override
    public String getPath() { return this.path + getName(); }
}
