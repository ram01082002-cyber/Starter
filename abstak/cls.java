package abstak;

abstract class animal{
    abstract void ani1();
    public static void ani2()
    {
        System.out.println("Dog");
    }
}
class bird extends animal
{
    public void bir()
    {
        System.out.println("duck");
    }
    public  void ani1()
    {
        System.out.println("ani1 is hear");
    }
}
public class cls {
    public static void main(String[] args) {
        bird obj = new bird();
        obj.ani1();
        obj.ani2();
        obj.bir();
    }
    
}
