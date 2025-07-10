class MyThread implements Runnable  {
   public void run(){
        System.out.println("i am runnable interface");
    }
    
}
class DemoThread2{
    public static void main(String[] args) {
        MyThread ob=new MyThread();
        Thread t=new Thread(ob);
        t.start();
    }
}