class thfread_2 implements Runnable{
    public void run(){
        System.out.println("pradii");
    }

    public static void main(String[] args) {
        Runnable r =new thfread_2();
        Thread t = new Thread(r,"Pradeep Murugan") ;
        t.start();
        String s = t.getName();
        System.out.println(s);
    }
}
