public class overload {
    static void load(int a,int b)
    {
        System.out.println(a+b);
    }
    static void load(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String args[]){
        load(2,3,4);
        load(1,2);
        load(5,4);
        load(0,0,6);
    }
}
