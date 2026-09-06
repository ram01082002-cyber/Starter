package interfacee;
@FunctionalInterface
interface a
{
   void show();
}
/*class b implements a
{
    public void show()
    {
        System.out.println("Functional Interface");
    }
}*/
public class funinterfac {
    public static void main(String[] args) {
        a obj = new a(){
        public void show()
        {
        System.out.println("Functional Interface");
        }
};
        obj.show();
    } 
}
