package interfacee;

interface computer{
    void code();
}
class laptop implements computer{
    public void code()
    {
        System.out.println("code-run");
    }
}
class desktop implements computer{
    public void code()
    {
        System.out.println("workes fast");
    }
    }
    class developer
    {
        public void dev(computer lap)
        {
            lap.code();
        }
    }
public class neddofinterfac {
    public static void main(String[] args) {
        computer lap = new laptop();
        computer com2 = new desktop();
        developer dev = new developer();
        dev.dev(com2);
    }
    
}
