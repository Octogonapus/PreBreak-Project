import java.util.ListIterator;

/**
 * Created by Ryan Benasutti on 3/16/2016.
 */

public class StringListIterator implements ListIterator<Character>
{

    @Override
    public boolean hasNext()
    {
        return false;
    }

    @Override
    public Character next()
    {
        return null;
    }

    @Override
    public boolean hasPrevious()
    {
        return false;
    }

    @Override
    public Character previous()
    {
        return null;
    }

    @Override
    public int nextIndex()
    {
        return 0;
    }

    @Override
    public int previousIndex()
    {
        return 0;
    }

    @Override
    public void remove()
    {

    }

    @Override
    public void set(Character character)
    {

    }

    @Override
    public void add(Character character)
    {

    }
}
