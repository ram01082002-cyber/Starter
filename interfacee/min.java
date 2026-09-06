package interfacee;

interface names{
    void name();
}
class n1 implements names
{
    public void name()
    {
        System.out.println("Ram");
    }
}
class n2 implements names
{
    public void name()
    {
        System.out.println("Kumar");
    }
}
class n3 implements names
{
    public void name()
    {
       System.out.println("Nickle");
    }
}
class display
{
    public void disp(names show)
    {
        show.name();
    }
}
public class min {
    public static void main(String[] args) {
        names ob1 = new n1();
        names ob2 = new n2();
        names ob3 = new n3();
        display d = new display();
        d.disp(ob3);
        d.disp(ob2); d.disp(ob1);
    }   
}