import interfacee.min;

abstract class main{
    abstract void show();
    abstract void disp();
}

public class abincls {
    public static void main(String[] args) {
        main obj = new main()                              //abstract and anonmous inner class
        {
          public void show()
          {
            System.out.println("Showing");
          }
          public void disp()
          {
            System.out.println("displaying");
          }
        };
        obj.show();
        obj.disp();
    }
    
}
