import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class demoo {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(105);
        l.add(20);
        l.add(35);
        l.add(40);
        l.stream().sorted()
        .forEach(n->System.out.println(n));
    }
}
