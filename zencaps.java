class a{
        public void show()
        {
            System.out.println("one");
        }
    }
class b extends a{
     public void show()
        {
            System.out.println("2");
        }
    }
class c extends b{
     public void show()
        {
            System.out.println("Three");
        }
    }
public class zencaps extends c {
    public void show()
    {
       System.out.println("4"); 
    }
    public static void main(String[] args) {
    a obj = new a();
    obj.show();
    obj=new b();
    obj.show();
    obj=new c();
    obj.show();
    obj=new zencaps();
    obj.show();
    }   
}