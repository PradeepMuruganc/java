interface pradee{
    public void p(int a,int b);
}
public class streamapi_5 {
    public static void main(String[] args) {
        pradee obj=(int a,int b)-> System.out.println(a+b);
        obj.p(5,10);
    }
}
