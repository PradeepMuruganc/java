import java.util.regex.*;
public class regex_1 {
    public static void main(String[] args) {
        Boolean b = Pattern.matches("...deep","Hdeep");
        if(b){
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
    }
}
