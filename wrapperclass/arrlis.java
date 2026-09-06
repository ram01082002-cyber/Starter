package wrapperclass;
import java.util.ArrayList;

public class arrlis {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(10);
        num.add(10);
        int s = 0;
        for(int nn: num)
        {
            s = nn + s;
        }
        System.out.println(s);
    

    }
    
}
