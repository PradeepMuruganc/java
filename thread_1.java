public class thread_1 {
    public static void main(String[] args) {
        Thread t = new Thread("Pradeep Murugan...");
        t.start();
        String s =t.getName();
        System.out.println(s);
    }
}
