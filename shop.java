public class shop {
    void s(int mony)
    {
        System.out.println(mony);
        System.out.println("s got it");
    }
    void c(int mony)
    {
        System.out.println(mony);
        System.out.println("c got it");
    }
    void p(int mony)
    {
        System.out.println(mony);
        System.out.println("p got it");
    }
    public static void main(String[] args){
        shop ob = new shop();
        ob.s(20);
        ob.c(20);
        ob.p(40);
    }
    
}