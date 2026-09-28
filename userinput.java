import java.io.IOException;
public class userinput {
    public static void main(String[] args)throws IOException {
        System.out.print("Enter num:");
        int n = System.in.read();// return oniy 1 byte/character so its return ASCII valu
        System.out.println(n);
    }
}