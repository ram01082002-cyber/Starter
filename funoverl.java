public class funoverl {
    void disp(int a,int b)
    {
        System.out.println(a+b);
    }
    void disp(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        funoverl ob = new funoverl();
        ob.disp(1,2,3);
        ob.disp(1,3);
    }  
}