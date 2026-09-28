package streamAPI;
import java.util.*;
import java.util.function.*;
public class mapstre {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(10,5,3,8,2,6);
        Function<Integer,Integer> pre = new Function<Integer,Integer>() {
            public Integer apply(Integer n)
            {
            return n*2;
            }
            };
        num.stream().map(pre).forEach(n -> System.out.println(n));
    }    
}