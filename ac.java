class a{
    int a =10,b=11;
    int sum(int a,int b)
    {
        return a+b;
    }
}
public class ac extends a {
    int sq (int a)
    {
        return a*a;
    }
    public static void main(String[] args) {
        ac ob = new ac();
        int a =ob.sum(3,3);
        System.out.println(a);
        System.out.print(ob.sum(5,1)+":"+ob.sq(5));

    }

    
}
