public class anon{

    public anon()
    {
        System.out.println("done");
    }
    void display()
    {
        System.out.println("veryfied");
    }                                                            //anonmous object
    public static void main(String[] args){
        new anon().display();
    }
}