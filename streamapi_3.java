import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class CompareList implements Comparator<Integer>{


    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }

}

public class streamapi_3 {
    public static void main(String[] args) {
        List<Integer>l=new ArrayList<Integer>();
        l.add(1000);
        l.add(150);
        l.add(50);
        l.add(100);
        l.add(207);
        l.add(400);
        l.add(10);
        l.stream().filter(n->n>100).sorted().forEach(n-> System.out.println(n));;



    }


}
