interface ParentEx1 {
    void a(int x,int y);
}
class childd implements ParentEx1{
    public void a(int x,int y){
        System.out.println(x*y);
    }
}
class son implements ParentEx1{
    public void a(int x,int y){
        System.out.println(x+y);
    }

}
public class RuntimePoly{
    public static void main(String[] args) {
        int b=5;
        int c=5;
        ParentEx1 d1=new childd();
        ParentEx1 d2=new son();
        d1.a(b,c);
        d2.a(b,c);
    }
}

