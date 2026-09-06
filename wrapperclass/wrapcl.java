package wrapperclass;
public class wrapcl {
    public static void main(String[] args) {
        int num = 8;
        Integer num1 = new Integer(num);//autoboxing
        System.out.println(num1);

        String s = "3";
        int nu = Integer.parseInt(s);
        System.out.println(nu*2);
    }   
}