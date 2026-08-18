class x{
    int b(int a,int b){
        return a-b;
    }   
}
class y extends x{
    int c(int a,int b)
    {
        return a*b;
    }
}
class z extends y{
    int d(int a,int b)
    {
        return a%b;
    }
}
class q extends z{
    int o(int a)
    {
        return a*a;
    }
}
public class w extends q {
    int a(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        w ob = new w();
        int a1 = ob.b(2,3);
        int b1 = ob.c(2,3);
        int c1 = ob.d(2,3);
        int d1 = ob.o(5);
        int e1 = ob.a(2,3);
        System.out.println(a1+":"+b1+":"+c1+":"+d1+":"+e1);
    }
    
}
