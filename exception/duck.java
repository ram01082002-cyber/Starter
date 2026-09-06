class a
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("date");
    }
}
public class duck {
    static
    {
        System.out.println("kyf");
    }
    public static void main(String[] args) {
        a ob = new a();
        try{
            ob.show();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}