package thread;

public class tred {
   static class A extends Thread
    {
        public void run()
        {
            for(int i=1;i<=5;i++)
            System.out.println("Ram");
        }
    }
    static class B extends Thread
    {
        public void run()
        {
            for(int i=1;i<=5;i++)
            System.out.println("kumar");
        }
    }
    
//public class tred {
    public static void main(String[] args) {
        A ob = new A();
        B obj = new B();
        ob.start();
        obj.start();
    }
}
