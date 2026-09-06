package interfacee;

interface a
{ 
    int a=2,b=2;
    void bug();
}
 interface b extends a 
 {
    void run();
 }
 class so implements b
 {
   public void bug()
   {
    System.out.println(a+b);
   }
   public void run()
   {
    System.out.println(a*a);
   }
 }
public class memo {
    public static void main(String[] args) {
        so obj = new so();
        obj.bug();
        obj.run();
    }  
}
