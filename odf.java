public class odf {
    int oodd(int n)
    {
        System.out.print((n%2==0)?"even" : "odd");
        return n;

    }
    public static void main(String[] args) {
        odf ob = new odf();
        int n = ob.oodd(2);
    }
    
}
