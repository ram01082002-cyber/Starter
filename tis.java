public class tis {
    private int age;
    private String name;

    public  int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public  String getName()
    {
        return name;
    }
    public void getName(String name)
    {
        this.name=name;
    }
    public static void main(String[] args) {
        tis ob = new tis();
        ob.setAge(20);
        ob.getName("july");
        System.out.println(ob.getAge()+"-"+ob.getName());
    }  
} 