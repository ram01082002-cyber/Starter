package thread;

//public class prisle {               priority and sleep
    class A extends Thread
    {
        public void run()    
        {
        for(int i=1;i<=100;i++)
        System.out.println("Ram");
        try
        {
            Thread.sleep(1);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        }
    }
    class B extends Thread
    {
        public void run()
        {
            for(int i=1;i<=100;i++)
            System.out.println("kumar");
         try
        {
            Thread.sleep(10);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        }
    }
    
public class prisle {
    public static void main(String[] args) {
        A ob = new A();
        B obj = new B();
        
        ob.setPriority(1);
        obj.setPriority(3);
        ob.start();
      
        
        obj.start();
    }
}