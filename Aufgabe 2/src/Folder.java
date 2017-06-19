import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This basically represents the "leaf"  or also an individual object
 */
public class Folder extends IComponent
{
    /* Members */
    private List<IComponent> childComponents; //can be files or folders

    public Folder(String name)
    {
        childComponents = new ArrayList<IComponent>();
        this.setName(name);
        this.setPath("/");
        this.setCreatedDate(new Date());
    }

    /* Composite Methods */
    public void Add(IComponent component)
    {
        component.setPath(this.path + this.name + "/");
        childComponents.add(component);
    }

    public void AddRange(IComponent[] components)
    {
        for(IComponent component : components)
            Add(component);
    }

    public void Delete(IComponent component)
    {
        if(childComponents.contains(component))
            childComponents.remove(component);
    }

    public IComponent getChild(int index)
    {
        return childComponents.get(index);
    }

    /* This tha unified methods */
    @Override
    public void print()
    {
        System.out.println("[FOLDER] This folder is called \""+ getName() + "\", created on \"" + getCreatedDate().toString() + "\" and is located at: \"" + getPath() + "\"");

        for(IComponent component : childComponents)
            component.print();
    }

    @Override
    public String getPath() { return this.path + getName() + "/"; }
}
