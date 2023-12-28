interface pradeepp{
    void a();
    default void b(){
        System.out.println("Pradeep Murugan");
    }
    default void c(){
        System.out.println("Livithra Murugan");
    }
}
public class default_methods {
    public static void main(String[] args) {
        pradeepp p=()-> System.out.println("Murugan");
        p.a();
        p.c();
        p.b();

    }
}
