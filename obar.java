public class obar {
 int ro;
 String na;
 int ma;
 public static void main(String[] args) {
    obar ob = new obar();
    ob.ro=10;
    ob.na="Ram";
    ob.ma=89;
    obar ob1 = new obar();
    ob1.ro=11;
    ob1.na="Raj";
    ob1.ma=99;
    obar ob2 = new obar();
    ob2.ro=12;
    ob2.na="Rake";
    ob2.ma=81;
    obar stud[] = new obar[3];
    stud[0]=ob;
    stud[1]=ob1;
    stud[2]=ob2;
    //for(int i=0;i<stud.length;i++)
    // System.out.println(stud[i].na+"-"+stud[i].ro+"-"+stud[i].ma);
    for(obar n:stud)
    System.out.println(n.na+" "+n.ro+" "+n.ma);
 }
    
}
