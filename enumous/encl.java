package enumous;

enum mobile
{
    vivo(22000),oppo(10000),redme;
    private int prise;
    private mobile()
    {
        prise =5000;
    }
    private mobile(int prise)
    {
         this.prise=prise;
    }
     public int getprise()
    {
        return prise;
    }
}
public class encl {
    public static void main(String[] args) {
       // mobile ob = mobile.vivo;
        //System.out.println(ob.getClass().getSuperclass());
        for(mobile m:mobile.values())
        System.out.println(m+":"+m.getprise());
    }
}
