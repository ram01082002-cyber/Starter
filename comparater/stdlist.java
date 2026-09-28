package comparater;
import java.util.*;
class student implements Comparable<student>
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
        return "student [age " + age + ", name"+name +"]";
    }
    public int compareTo(student that)
    {
        if(this.age>that.age)
                    return 1;
                else 
                    return -1;
    }
}
public class stdlist {
      public static void main(String[] args) {
        Comparator<student> com = new Comparator<student>() {
            public int compare(student i,student j)
            {
               if(i.age>j.age)
                    return 1;
                else 
                    return -1;
            }
        };
        List<student> num = new ArrayList<>();
        num.add(new student(37,"boya"));
        num.add(new student(21,"bala"));
        num.add(new student(56,"hari"));
        num.add(new student(30,"boy"));
        num.add(new student(30,"boy"));
        Collections.sort(num);
        for (student s : num)
        System.out.println(s);
    }      
}