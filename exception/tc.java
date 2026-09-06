package exception;

public class tc {
    public static void main(String[] args) {
        int num = 14;
        try
        {
           int n = 2/num;
           System.out.println(n);
        }
        catch(Exception e)
        {
            System.out.println("index outof bounre");
        }
        System.out.println(num);
    }
}
