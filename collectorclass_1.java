import java.util.*;
import java.util.stream.Collectors;

public class collectorclass_1 {
    public static void main(String[] args) {
        List<Integer>l=new ArrayList<Integer>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        Map<Integer,Integer> s=l.stream().filter(n->n>20).collect(Collectors.toMap(n->n/10, n->n ));

        s.entrySet().stream().forEach( n-> System.out.println(n.getKey() + " " + n.getValue()));
    }
}
