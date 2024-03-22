package advanced.thread;

public class ThreadDemo {
    public static void main(String[] args) {
        // demo1();
    }
    public static void demo1(){
        Mythread thread1 = new Mythread();
        Mythread thread2 = new Mythread();
        thread1.setName("Thread1");
        thread2.setName("Thread2");
        thread1.start();
        thread2.start();
    }
}
