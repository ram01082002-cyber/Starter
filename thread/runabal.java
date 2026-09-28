package thread;

class A implements Runnable{
    public void run(){
    for(int i=1;i<=3;i++)
    System.out.println("Ram");
    }
    }
    class B implements Runnable{
    public void run(){
        for(int i=1;i<=3;i++)
        System.out.println("kumar");
        }
    }
    public class runabal {
    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B();
        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);
        t1.start();
        t2.start();
    }
}