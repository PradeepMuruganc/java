import java.util.regex.*;
public class regularexpression {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("pradeep",Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("Pradeep is a good boy");
        Boolean matchfound =m.find();
        if(matchfound){
            System.out.println("success");
        }
        else{
            System.out.println("Sorry Not found");
        }
    }
}
