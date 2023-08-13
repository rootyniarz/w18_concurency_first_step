public class RunnableThreadImplementation implements Runnable{
    public void run(){
        System.out.println("Siema po raz drugi z runnable'a");
        System.out.println(Thread.currentThread().getName());

    }
}
