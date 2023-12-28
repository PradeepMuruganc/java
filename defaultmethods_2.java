interface demo{
    void a();
    default void b(){
        System.out.println("Pradeep");
    }
}
class d implements demo{
    public void a(){
        System.out.println("HI");
    }
//    public void b(){
//        System.out.println("Pradiii");
//    }
}
public class defaultmethods_2 {
    public static void main(String[] args) {
        demo dd=new d();
        dd.a();
        dd.b();
    }
}
