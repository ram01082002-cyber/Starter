public class theo {
    public static void main(String[] args) {
        int i = 0,j=0;
        try{
            j=i/10;
            if(j==0)
            throw new ArithmeticException("loading....");
        }
        catch (ArithmeticException e) {
            j=18/1;
            System.out.println(j+" : Default valu"+e);
        }
        catch(Exception e)
        {
            System.out.println("Somethig wrong");
        }
        System.out.println(i);
    }
}