class MyThread extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<10){
            System.out.println(i+" Hello Thread");
            i++;
        }
    }
}
public class ThreadTest {
    public static void main(String[] args){
        MyThread thread = new MyThread();
        thread.start();
        int i = 0;
        while(i<10){
            System.out.println(i+" Hello Main");
            i++;
        }
    }
}