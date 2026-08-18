class b {
    void even(int b)
    {
        if(b%2==0)
        System.out.println("even"+b);
    }
}
class c extends b{
    void fact(int c)
    {
        int f=1;
        for(int i=1;i<=c;i++)
        {
            f=f*i;
        }
        System.out.println(f);
    }
}
class d extends c{
    void rem(int n)
    {
        int n1 = 0;
        n1=n/10;
        System.out.println(n1);
    }
}class da extends d{
    void odd(int a)
    {
        if(a%2!=0)
        System.out.println("odd"+a);
    }

    public static void main(String[] args) {
        da ob = new da();
        ob.odd(7);
        ob.even(88);
        ob.fact(5);
        ob.rem(7567);
        
    }
}
   