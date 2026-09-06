package enumous;
enum status
{
      running,arraived,deported;
}
public class enam {
    public static void main(String[] args) {
        status[] s = status.values();
        for(status ss: s){
        System.out.println(ss+":"+ss.ordinal());
    }  
}
}