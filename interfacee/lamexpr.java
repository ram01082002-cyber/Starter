package interfacee;

interface a
{
    int add(int x,int y);
}
public class lamexpr {
    public static void main(String[] args) {
        a ob =(x,y) -> x+y;
        int rslt = ob.add(2,3);
        System.out.println(rslt);
    }   
}