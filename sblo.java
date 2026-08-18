public class sblo {
    static int n =10;
    static
    {
        System.out.println("two");              //static block
    }
    static
    {
        System.out.println("three");
    }
    public static void main(String[] args) {
        System.out.println(n);
    }
    
}
