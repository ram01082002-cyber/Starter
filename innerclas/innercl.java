package innerclas;
class animal
{
    int no = 6;
    public void show()
    {
        System.out.println("Showeddd");
    }
    class dod
    {
        public void show1()
        {
            System.out.println(no);         //inner class
        }
    }
}
public class innercl {
    public static void main(String[] args) {
        animal ob = new animal();
        ob.show();
        //ob.no();
        animal.dod obj = ob.new dod();
        obj.show1();
    }
    
}
