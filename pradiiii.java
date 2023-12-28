interface Functional_interface {
    static void age() {
        System.out.println("He is 21 years old");
    }

    void add(int a, int b);
}

class pradiiii implements Functional_interface{
        @Override
        public void add(int a, int b) {
            System.out.println(a+b);
        }
        public static void main(String[] args) {
            pradiiii p=new pradiiii();
            p.add(5,10);
            Functional_interface.age();
    }
    }
