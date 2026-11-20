class MyThread implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(i<10){
            System.out.println(i+" Hello Thread");
            i++;
        }
    }
}
public class RunnableTest {
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        Thread t = new Thread(myThread);
        t.start();
        int i = 0;
        while(i<10){
            System.out.println(i+" Hello Main");
            i++;
        }
    }
}
