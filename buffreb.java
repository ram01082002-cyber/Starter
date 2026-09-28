import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffreb {
    public static void main(String[] args)throws IOException {
        System.out.print("Enter number:");
        /*int num = System.in.read();
        System.out.println(num);*/ 
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(i);
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        bf.close();

    }   
}