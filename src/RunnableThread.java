public class RunnableThread  {
    public static void main(String[] args) {

        // both of the thread will work parallelly.
        NewThread nt=new NewThread("First thread running ");
        NewThread nt2=new NewThread("Second thread running ");
    }
}

class NewThread implements Runnable{

    Thread t;
    String s;

    NewThread(String s){
        t=new Thread(this,"Limon's thread");
        t.start();
        this.s=s;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(s+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Complete of "+s);

    }
}