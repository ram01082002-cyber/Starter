class cal
{
    public int add(int a,int b)
    {
       return a+b;
    }
}
public class oac extends cal {
    public int ad(int a,int b)                  //method overridding
    {
        return a+b+1;
    }
    public static void main(String[] args) {
        oac ob = new oac();
        int e = ob.add(3,3);
        System.out.println(e);
    }
    
}
