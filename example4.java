import java.util.*;
class Book
{
    private  String name;
    private double price;
    public Book(String s,double d)
    {
        this.name=s;
        this.price=d;
    }
    public String get_name()
    {
        return name;
    }
    public double get_price()
    {
        return price;
    }
    
}
class mycomputer implements Comparator
{
    public int compare(Object o1,Object o2)
    {
        Book book=(Book)o1;
        Book book1=(Book)o2;
        if(book.get_price()<book1.get_price())
        return -1;
        else
        return 1;



    }
}

public class example4 
{
    public static void main(String [] args)
    {
        Book b1=new Book("php",300);
        Book b2=new Book("java",500);
        Book b3=new Book("my os",400);
        Book b4=new Book("aoa",900);
        TreeSet t1=new TreeSet(new mycomputer());
        t1.add(b1);
        t1.add(b2);
        t1.add(b3);
        t1.add(b4);
        Book b;
        Iterator it=t1.iterator();
        while(it.hasNext())
        {
       b=(Book)it.next();
       System.out.println(b.get_name()+ "  " +b.get_price());

        }

    }
}
