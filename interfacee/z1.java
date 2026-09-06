package interfacee;
import c;

interface a
    {
        void s1();
    }
    interface b
    {
        void s2();

    }
    interface c
    {
        void s3();
    }
    class main implements a,b,c{
       public void s1()
        {
          System.out.println("10");
        }
        public void s2()
        {
          System.out.println("20");
        }
        public void s3()
        {
          System.out.println("30");
        }
    }
public class z1 {
    public static void main(String[] args) {
        main ob = new main();
        ob.s1();
        ob.s2();
        ob.s3();  
    }        
}
//public class z1 {
    
//}
