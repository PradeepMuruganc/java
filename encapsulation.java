public class encapsulation {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void main(String args[]){
        encapsulation e=new encapsulation();
        e.setName("Pradeep Murugan");
        System.out.println(e.getName());
        System.out.println(e.getName().length());
        e.setName("Pradii");
        System.out.println(e.getName());
    }
}
