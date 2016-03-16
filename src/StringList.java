import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Ryan Benasutti on 3/16/2016.
 */

public class StringList implements List<Character>
{
    private String s;
    private StringList self = this;

    public StringList()
    {
        this.s = "";
    }

    public StringList(String s)
    {
        this.s = s;
    }

    /**
     * Adds a character after the last index.
     *
     * @param c The character to add
     * @return  Returns true (as specified in List.add(E))
     * @throws NullPointerException
     */
    public boolean add(Character c) throws NullPointerException
    {
        if (c == null)
            throw new NullPointerException();

        s += c;
        return true;
    }

    /**
     * Adds a character at an index.
     *
     * @param index The index to add the character at
     * @param c     The character to add
     * @throws NullPointerException
     * @throws IndexOutOfBoundsException
     */
    public void add(int index, Character c) throws NullPointerException, IndexOutOfBoundsException
    {
        if (c == null)
            throw new NullPointerException();
        else if (index < 0 || index > s.length())
            throw new IndexOutOfBoundsException();

        s = s.substring(0, index) + c + s.substring(index);
    }

    /**
     * Gets a character at an index.
     *
     * @param index The index at which the character to get is located
     * @return      The character at index
     * @throws IndexOutOfBoundsException
     */
    public Character get(int index) throws IndexOutOfBoundsException
    {
        if (index < 0 || index >= s.length())
            throw new IndexOutOfBoundsException();

        return s.charAt(index);
    }

    /**
     * Removes and returns a character at an index.
     *
     * @param index The index to remove the character at
     * @return      The character that was removed
     * @throws IndexOutOfBoundsException
     */
    public Character remove(int index) throws IndexOutOfBoundsException
    {
        if (index < 0 || index >= s.length())
            throw new IndexOutOfBoundsException();

        Character c = s.charAt(index);
        s = s.substring(0, index) + s.substring(index);
        return c;
    }

    /**
     * Sets a character at an index.
     *
     * @param index The index at which the character to be set is located
     * @param c     The new character
     * @return      The previous character
     * @throws NullPointerException
     * @throws IndexOutOfBoundsException
     */
    public Character set(int index, Character c) throws NullPointerException, IndexOutOfBoundsException
    {
        if (c == null)
            throw new NullPointerException();
        else if (index < 0 || index >= s.length())
            throw new IndexOutOfBoundsException();

        Character cOld = s.charAt(index);
        s = s.substring(0, index - 1) + c + s.substring(index);
        return cOld;
    }

    /**
     * Gets the size of this string.
     *
     * @return The size of this string
     */
    public int size()
    {
        return s.length();
    }

    @Override
    public boolean isEmpty()
    {
        return false;
    }

    @Override
    public boolean contains(Object o)
    {
        return false;
    }

    @Override
    public Iterator<Character> iterator()
    {
        return null;
    }

    @Override
    public Object[] toArray()
    {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a)
    {
        return null;
    }

    @Override
    public boolean remove(Object o)
    {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c)
    {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Character> c)
    {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Character> c)
    {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c)
    {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c)
    {
        return false;
    }

    @Override
    public void clear()
    {

    }

    @Override
    public int indexOf(Object o)
    {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o)
    {
        return 0;
    }

    @Override
    public ListIterator<Character> listIterator()
    {
        throw new Error("Define this.");
    }

    @Override
    public ListIterator<Character> listIterator(int index)
    {
        return null;
    }

    @Override
    public List<Character> subList(int fromIndex, int toIndex)
    {
        return null;
    }
}
