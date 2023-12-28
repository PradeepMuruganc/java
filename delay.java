public class delay extends Thread {
    @Override
    public void run() {

        try{
        delay.sleep(5000);}
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Pradeep Murugan");
    }


    public static void main(String[] args) {
        delay d1 = new delay();
        d1.start();


    }
}

