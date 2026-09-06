package interfacee;

interface animals{
    void name();
}
class ani1 implements animals
{
    public void name()
    {
        System.out.println("It's dog");
    }
}
class ani2 implements animals
{
    public void name()
    {
        System.out.println("It's cat");
    }
}
class show
{
    public void sh(animals ani)
    {
       ani.name();
    }
}

public class intimp {
    public static void main(String[] args) {
    animals ob = new ani1();
    animals obj = new ani2();
    show obje = new show();
    obje.sh(obj);
    obje.sh(ob );
    }
}
