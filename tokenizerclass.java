import java.util.StringTokenizer;
import java.util.Scanner;
public class tokenizerclass {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String name =  s.nextLine();
        StringTokenizer t=new StringTokenizer(name);
        while(t.hasMoreElements()){
            System.out.println(t.nextToken("."));
        }

    }
}
