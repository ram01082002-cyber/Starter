package thread;
class sum
{   int cout; 
    public synchronized void add()
    {
        cout++;
    }
}
public class rac {
      public static void main(String[] args)throws InterruptedException {
        sum s = new sum(); 
        Runnable ob1 = () ->{
        for(int i=1;i<=5;i++)
        s.add();
    };
        Runnable ob2 = ()->{
        for(int i=1;i<=5;i++)
        s.add();
    };
        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);
        t1.start();
        t2.start(); 
        t1.join();
        t2.join(); 
        System.out.println(s.cout);
    } 
    
}
