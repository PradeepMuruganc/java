import java.util.Scanner;

class encapsule {
    private int a;
    private String b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }



}
class institute{
    public static void main(String args[]){
        encapsule e=new encapsule();
        Scanner s=new Scanner(System.in);

        String name;
        System.out.print("enter the name: ");
        name=s.nextLine();
        e.setB(name);
        System.out.println(e.getB());
        int size;
        System.out.print("enter the size: ");
        size=s.nextInt();
        e.setA(size);
        System.out.println(e.getA());
    }
}
