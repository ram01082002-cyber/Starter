public class adcalc extends calc
{
    int mul(int a,int b)         
    {
        return a*b;
    }
    int div(int a,int b)
    {
        return a/b;
    }    
public static void main(String[] args)    //inheritans
{
    adcalc ob = new adcalc();
    //calc obj = new calc();
    int o1 = ob.add(5,5);
    int o2 =ob.sud(10,5);
    int o3=ob.mul(5,3);
    //int o4=obj.div(15,3);
    System.out.println(o1+":"+o2+":"+o3+":"+"o4");
    System.out.println(ob.div(10,2));
}
}
