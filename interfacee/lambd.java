package interfacee;

interface a
{
    void disp(int i);
}
public class lambd {
    public static void main(String[] args) {
        a obj = i->System.out.println(i);
        obj.disp(5);
    } 
}
