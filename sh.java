public class sh {
    int n;
    static String s;
    void show()
    {
        System.out.println(n+"-"+s);
    }
    public static void main(String[] args) {
        sh ob = new sh();
        ob.n=682;
        sh.s="uoegf";
         sh ob1 = new sh();
        ob1.n=62;
        ob1.s="ugf";
        ob.s="good";
        ob.show();
        ob1.show();

    }
    
}
