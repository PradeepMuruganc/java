public class testcall_run2 extends Thread{
        public void run(){
            for(int i=1;i<5;i++){
                try{
                    Thread.sleep(500);
                }
                catch(InterruptedException e){
                    System.out.println(e);
                }
                System.out.println(i);
            }
        }
        public static void main(String args[]){
            testcall_run2 t1=new testcall_run2();
            testcall_run2 t2=new testcall_run2();

            t1.run();
            t2.run();
        }
    }

