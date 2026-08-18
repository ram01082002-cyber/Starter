public class twoda {
    public static void main(String[] args)
    {
        int n[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            n[i][j]=(int)(Math.random()*10);
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
