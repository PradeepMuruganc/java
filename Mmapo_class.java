import java.util.*;
public class Mmapo_class {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(6, "Pradeep");
        hm.put(2, "Aakash");
        hm.put(5, "Bharath");
        hm.put(1, "Gladson");
        hm.put(3, "Harivishnu");

//        hm.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

//        Iterator<Integer> keys = hm.keySet().iterator();

//        while(keys.hasNext()){
//            int k = keys.next();
//            System.out.println(k+ " " + hm.get(k));
//        }
        for(Map.Entry a: hm.entrySet()){
            System.out.println(a.getKey()+" "+a.getValue());
        }
    }
}
