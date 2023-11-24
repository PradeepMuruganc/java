interface Aa{
    abstract void A();
}
class Bb implements Aa {
    public void A() {
        System.out.println("Pradeep");
    }

    public void B() {
        System.out.println("Murugan");
    }
}

    public class interfacee {
        public static void main(String[] args) {
            Bb b = new Bb();
            b.A();
            b.B();
        }
    }

