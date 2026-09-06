package innerclas;
public class stat {
    String dog = "boww";
    public void sho()
    {
        System.out.println("Dogg");
    }
    static class pet{
        public void show()
        {
            stat ob = new stat();
            System.out.println(ob.dog);
        }
    }
    public static void main(String[] args) {
        stat ob = new stat();
        ob.sho();
        stat.pet obj = new stat.pet();
        obj.show();   
    }   
}