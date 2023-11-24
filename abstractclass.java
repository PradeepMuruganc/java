abstract class abstractclass_1 {
    abstract void A();
    void B(){
        System.out.println("pradeep");
    }
}
class ab extends abstractclass_1{
    void A(){
        System.out.println("Pradii");
    }

}
class abstractclass{
    public static void main(String[] args) {
        ab obj=new ab();
        obj.A();
        obj.B();
    }
}
