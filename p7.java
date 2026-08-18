public class p7 {
    public static void main(String[] args) {
        int n=17;
        int c=0;
        for(int num=2; ;num++){
        int f =0;
        for(int i=1;i<=n;i++){
        if(n%i==0)
        f++;
    }
        if(f==2)
        c++;
        if(c==n)
        System.out.println("prime");
    }
    }
}