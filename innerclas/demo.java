package innerclas;
class bird{
    String any ="fly";
    int tim = 2;

    public void show()
    {
        System.out.println(any+":"+tim);
    }
   static class notb{
        public void disp()
        {
           // bird ob = new bird();                                 static class
           //System.out.println(ob.tim+"-"+ob.any);
           System.out.println("Static method without variable implement ");
        }
    }
}
public class demo {
    public static void main(String[] args)
    {
        bird ob = new bird();
        ob.show();
        bird.notb obj = new bird.notb();
        obj.disp();
    }   
}