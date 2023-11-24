public class example {
    protected int a;
    public void b(int a){
        this.a=a;
        System.out.println(a);
    }
}
class ex extends example{

    public static void main(String args[]){
        String name="Pradeep";
        ex e=new ex();
        e.b(5);
        exe exx=new exe();
        exx.nan();
        System.out.println(name);

    }
}
class exe extends example{
    String name ="Nandhini";
    public void nan(){
        System.out.println(name);
    }


}
