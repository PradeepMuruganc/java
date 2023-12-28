class Aa{
    Aa(){
        System.out.println("This is block A...");
    }
}
class Bbb extends Aa{
    Bbb(){

        super();
        System.out.println("This is block B...");
    }
    {System.out.println("This is instance initializer block");}
}

public class revise {
    public static void main(String[] args) {
        Bbb b=new Bbb();


    }
}
