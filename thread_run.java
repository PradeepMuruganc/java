class thread_run extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        thread_run t = new thread_run();
        t.start();
    }
}
