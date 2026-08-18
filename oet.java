public class oet {
    public static void main(String[] args)
    {
        int n =4;
        //System.out.print(n%2==0 ? "even" : "odd");
        int re = n%2==0 ? 1 : 2; // for int cond op
        String res = (n%4 == 0) ? "even" : "odd";
        System.out.print(re  +  "   "+    res);
}
}