package finalkeys;

public class fmeth {
    public final void show()
    {
        System.out.println("Final key passsed");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public void show()             //final method
    {
        System.out.println("override not possible");
    }
    public static void main(String[] args) {
        fmeth ob = new fmeth();
        ob.show();
        ob.add(2,3);
       // ob.show();
        
    }
    
}
