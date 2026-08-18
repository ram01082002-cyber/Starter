public class mob {
    String bran ="";
    String mod ="";
    int stor =0;
    int pric =0;
    public static void main(String[] args) {
        mob vivo1 = new mob();
        vivo1.bran="VIVO";
        vivo1.mod="T4";
        vivo1.stor=128;
        vivo1.pric=22000;
        System.out.println(vivo1.mod);
        mob vivo2 = new mob();
        vivo2.bran="";
        vivo2.mod="T4";
        vivo2.pric=22000;
        System.out.println(vivo2.stor);
    }
    
}
