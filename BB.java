class A{
    public A()
    {
        super();
        System.out.println("A");
    }
    public A(int a)
    { 
         //super();
       this();
      System.out.println("int A");
    }
}
class BB extends A{
    public BB()
    {
      super(4);                            //this();&super(); method
      System.out.println("B");
    }
    public BB(int a)
    {
        this();
        System.out.println("int B");
    }
    public static void main(String[] args) {
        BB ob = new BB(3);
    }
    
}
