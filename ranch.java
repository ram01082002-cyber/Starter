import java.util.Random;

public class ranch {
    public static void main(String[] args) {
       Random r = new Random();
       //char c = (char)('a' + (int)(Math.random()*26));
       //char ca = (char)('A' + (int)(Math.random()*26));
      for(int i=1;i<=5;i++){
      char a = (char)('a' + r.nextInt(26));
      System.out.print(a); }

    }   
}