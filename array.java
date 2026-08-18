import java.util.Scanner;

public class array {
    public static void main(String[] args)
    {
        int[] num = new int[5];
        Scanner san = new Scanner(System.in);
        num[0] = san.nextInt();
        num[1] = san.nextInt();
        num[2] = san.nextInt();
        num[3] = san.nextInt();
        num[4] = san.nextInt();
        System.out.print(num[0]+num[1]+num[2]+num[3]+num[4]);


    }
    
}
