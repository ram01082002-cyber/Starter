package thread;
    public class runanomous {
    public static void main(String[] args) {
        Runnable ob1 = () ->{
        for(int i=1;i<=3;i++)
        System.out.println("Ram");
    };
        Runnable ob2 = ()->{
        for(int i=1;i<=3;i++)
        System.out.println("kumar");
    };
        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);
        t1.start();
        t2.start();  
    } 
}