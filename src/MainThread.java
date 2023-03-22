public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t=Thread.currentThread();
        System.out.println("Current thread: "+t);

        //change current thread name:
        t.setName("Limon's thread");
        System.out.println("Current thread after changing name: "+t);


        for(int i=0;i<5;i++){
            System.out.println(i);
            Thread.sleep(1500);
        }
    }
}
