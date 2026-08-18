class over 
{
    void disp()
    {
        System.out.println("over");
    }
}
class ove extends over
{
    void disp()
    {
        System.out.println("ridding");
    }
}
public class ovtwo extends ove 
{
    void disp()
    {
        System.out.println("overrided");
    }
    public static void main(String[] args) {
        ovtwo ob = new ovtwo();
        ob.disp();
        //ob.disp();
        //ob.disp();
    }
}