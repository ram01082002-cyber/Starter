package interfacee;

interface a
{
    int age =20;    //final key in interface
    void show();
    void disp();
}
class b implements a{
public void show()
{
    System.out.println("show");
} 
public void disp()
{                                                                //interface
    System.out.println("Disp");
}
}
public class infac {
    public static void main(String[] args) {
        b ob = new B();
        ob.disp();
        ob.show();
        System.out.println(a.age);
    }   
}
