import java.util.*;

public class streamapi_2 {
    public static void main(String[] args) {
        List<String>l=new ArrayList<String>();
        l.add("Pradeep");
        l.add("Livithra");
        l.add("Murugan");
        l.add("Tamilselvi");
        l.add("Santhoshkumar");
        l.stream().sorted().forEach(n-> System.out.println(n));

    }
}
