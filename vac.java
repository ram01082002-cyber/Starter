public class vac extends adcalc
    {
    double po(int a,int b)
    {
            return Math.pow(a,b);
    }
   public static void main(String[] args) {
    vac ob = new vac();
    int o1 = ob.add(5,5 );
    int o2 = ob.sud(5,5);
    int o3 = ob.mul(5,5);
    int o4 = ob.div(5,5);
    double o5 = ob.po(5,5);
    System.out.println(o1 + " " + o2 + " " + o3 + " " + o4 + " " + o5);       
}
}
