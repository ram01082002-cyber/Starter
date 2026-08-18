public class enc {
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }
    public void setAge(int a)
    {                                                      //encapsulation without declearing
        age =a;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String s)
    {
            name = s;
    }
    public static void main(String[] args) {
        enc ob = new enc();
        ob.setAge(20);
        ob.setName("Ram");
        System.out.println(ob.getAge()+" - "+ob.getName());
    }
    
}
