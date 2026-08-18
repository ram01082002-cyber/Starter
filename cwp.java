public class cwp {                                       //parameterized  constructor
    int ro;
    String mak;

    public cwp(int ro, String mak)    //(int o,int m)
    {                                 //ro=o;
        this.ro=ro;                   //mak=m
        this.mak=mak;
    }
    public static void main(String[] args) {
        cwp ob = new cwp(133,"cse");
        System.out.println(ob.ro+":"+ob.mak);
    }  
}
