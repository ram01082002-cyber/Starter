class a
{
    public void show1()
    {
        System.out.println("A its");
    }
}
public class ucdc extends a{
     public void show2()
    {
        System.out.println("b its");
    }
    public static void main(String[] args) {
        a ob = new ucdc();          //upcasting
        ob.show1();             
        ucdc ob1 =(ucdc) ob;        //downcasting
        ob1.show2();
    }
}
