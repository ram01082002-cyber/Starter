public class sumfun {
    int sum(int a,int b)
    {
        int c =a+b;
        return c;
    }
    public static void main(String[] args) {
        sumfun ob = new sumfun();
        int sum = ob.sum(10,5);
        System.out.println(sum);

    }
    
}
