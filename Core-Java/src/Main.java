public class Main {

    //Thread run independent of each other.
    //DEMON threads is a background thread . non user thread.
    //the java program will wait for the user threads to finish before running the DEAMON threads.
    //if there is no running threads , even the Deamon threads are running, the java program will be terminated.
    //---because java does not care about background threads.

    public static void main(String[] args) throws InterruptedException {
        //method 1 to create a thread
        Mythread thread1 = new Mythread();

        //method 2 to create a thread
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        //making threads DEAMON
//        thread1.setDaemon(true);
//        thread2.setDaemon(true);


        thread1.start();
        thread1.run();
//        thread1.join(); // thread 2 will run after thread 1 finishes. Thread 2 pauses.
//        thread1.join(3000);

//        thread2.start();

    }
}
