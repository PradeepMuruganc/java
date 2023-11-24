class A{
    A(){
        System.out.println("This is block A...");
    }
}
class B extends A{
    B(){
        super();
        System.out.println("This is block B...");
    }
    {System.out.println("This is instance initializer block");}
}

public class initializer_block {
    public static void main(String[] args) {
        B b=new B();


    }
}
