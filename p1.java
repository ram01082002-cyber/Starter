public class p1 {
    public static void main(String[] args) {
            int count = 0;
            int n = 98;
            for(int i=1; i<=n; i++)
            {
                if(n%i==0)
                count++;    
            }
            System.out.println((count==2) ? "prime" : "not");     
        }
}
    
