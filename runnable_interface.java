class runnable_interface implements Runnable {
    @Override
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        runnable_interface r = new runnable_interface();
        Thread t = new Thread(r);
        t.start();
    }
}
