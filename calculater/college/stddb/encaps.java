package college.stddb;
class comp{
    public void show()
    {
        System.out.println("Its Computer");
    }
}
class laptop extends comp{
    public void show()
    {
        System.out.println("Its Laptop");
    }                          
}
class encaps extends laptop{
    public void show()
    {
        System.out.println("Its Dynamic polymorphism");
    }
public static void main(String[] args) {
    comp ob = new comp();
    ob.show();
    ob=new laptop(); 
    ob.show();
    ob=new encaps();
    ob.show();
}
}
