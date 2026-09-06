package innerclas;

class b
{
    public void show()
    {
        System.out.println("jump");
    }
}
public class anomos {
    public static void main(String[] args) {           //anonmous class
        b obj = new b()
        {
          public void show()
          {
            System.out.println("Frog");
          }  
        };
        obj.show();
    }
}
