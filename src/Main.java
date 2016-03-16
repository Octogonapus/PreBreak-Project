import java.util.ListIterator;

/**
 * Created by Ryan Benasutti on 3/16/2016.
 */

public class Main
{
    public static void main(String[] args)
    {
//        StringList a = new StringList("abcdefg");
//        a.add(new Character('1'));
//        a.add(new Character('2'));
//        System.out.println(a.get(0));
//        System.out.println(a.get(7));
//        System.out.println(a.get(8));

//        StringList a = new StringList("");
//        a.add(new Character('X'));
//        System.out.println(a.size());
//        a.add(0,new Character('Y'));
//        System.out.println(a.size());
//        a.add(0,new Character('Z'));
//        System.out.println(a.size());
//        a.add(1,new Character('R'));
//        System.out.println(a.size());
//        a.add(4,new Character('x'));
//        System.out.println(a.size());
//        for (int i = 0; i < a.size(); i++)
//            System.out.print(a.get(i) + " ");
//        System.out.println();

        StringList a = new StringList( "StringList" );
        ListIterator b = a.listIterator();
        b.remove();
    }
}
