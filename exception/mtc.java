package exception;

public class mtc {
    public static void main(String[] args) {
        int i = 10;
        int num[] = new int[3];
        num[0] = 6;
        String str = null;
        try
        {
         int j=i/0;
       // System.out.println(num[5]);
        System.out.println(str.length());
        }
        catch(ArithmeticException o)
        {
        System.out.println("Logic");
        }
        catch(IndexOutOfBoundsException o)
        {
        System.out.println("outof limit"+num[0]);
        }
        catch(Exception o)
        {
            System.out.println("Null String"+o);
        }
       // System.out.println(j);
       // System.out.println(str.length());
    }
}