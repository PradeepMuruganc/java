public class sleep_method extends Thread {
    public void run() {
        for (int i = 1; i < 6; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);

        }
    }

    public static void main(String[] args) {
        sleep_method t1 = new sleep_method();
        sleep_method t2 = new sleep_method();
        t1.start();
        t2.start();
    }
}
