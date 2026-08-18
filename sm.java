public class sm {
    int n ;
    String s;
    static void show(sm ob)                           //static method
    {
        System.out.println(ob.n +" "+ob.s);
    }
   public static void main(String[] args)
    {
        sm ob = new sm();
        ob.n=33;
        ob.s="the";
        sm.show(ob);

    }
    
}
