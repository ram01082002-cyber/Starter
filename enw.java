public class enw {
    private int age=20;
    private String name="Ram";
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public static void main(String[] args) {
        enw ob = new enw();
        System.out.print(ob.getAge()+"-"+ob.getName());
    }
}
 