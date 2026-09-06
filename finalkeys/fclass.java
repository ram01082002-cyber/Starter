package finalkeys;

final class meth{
     void show()
    {
        System.out.println("main");
    }
}
class fclass{ //extends meth {                                  final class
     void show()             
    {
        System.out.println("nooo");
    }

    public static void main(String[] args) {
        fclass ob = new fclass();
        ob.show();
        
    }
}
