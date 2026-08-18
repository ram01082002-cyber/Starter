public class co {
    private int age;
    private String name;

    public co()
    {
        age=20;
        name ="Ram";
    }     
    void display()
    {
        System.out.println(age+":"+name);
    }                                                  //constructor
   /*  public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    } */
    public static void main(String[] args) {
        co ob = new co();
        ob.display();
        //System.out.println(ob.getAge()+":"+ob.getName());
    }

    
}
