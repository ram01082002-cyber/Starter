package comparater;
import java.util.*;
class student
{
    int age;
    String name;
    public student(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    public String toString()
    {
        return "[age = " + age + " : name = "+ name  +"]";
    }
}
public class teourcomp {
      public static void main(String[] args) {
        Comparator<student> com =(i,j)-> i.age>j.age?1:-1;
        List<student> num = new ArrayList<>();
        num.add(new student(37,"boya"));
        num.add(new student(21,"bala"));
        num.add(new student(56,"hari"));
        num.add(new student(30,"boy"));
        num.add(new student(30,"boy"));
        Collections.sort(num,com);
        for (student s : num)
        System.out.println(s);
    }      
}
