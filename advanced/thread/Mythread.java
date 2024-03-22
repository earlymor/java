package advanced.thread;

public class Mythread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(getName()+"hello world");
        }
    }
}
