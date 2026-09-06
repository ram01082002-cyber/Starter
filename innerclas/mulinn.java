package innerclas;

class arit{
    int a=5,b=5;
    class add{
        public void pls()
        {
            System.out.println(a+b);
        }
    }
    class sub{
        public void min()
        {
            System.out.println(a-b);
        }
    }
    class mul{
        public void in()
        {
            System.out.println(a*b);
        }
    }
}
public class mulinn {
    public static void main(String[] args) {
        arit ob = new arit();
        arit.add obj = ob.new add();
        obj.pls();
        arit.sub obje = ob.new sub();
        obje.min();
        arit.mul oo = ob.new mul();
        oo.in();
        
    }
    
}
