import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class collectorclass_2 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(105);
        l.add(20);
        l.add(35);
        l.add(40);
        Set<Integer>s=l.stream().filter(n->(n%2==0)).collect(Collectors.toSet());
        System.out.println(s);
    }
}
