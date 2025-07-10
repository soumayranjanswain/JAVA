class MyThread1 extends Thread{
    public void run(){
        //System.out.println("i am Thread");
        for( int i=0;i<=5;i++){
            System.out.println("i am Thread1"+ i);
            if(i==1){
                try {
                    sleep(1000);
                }catch(Exception e){
                    System.out.println("e");
                }
                
                  
            }
        }
        System.out.println("Exit from Thread1");
        
    }

}
class MyThread2 extends Thread{
    public void run(){
        //System.out.println("i am Thread");
        for( int j=0;j<=5;j++){
            System.out.println("i am Thread2"+ j);
        }
        System.out.println("Exit from Thread2");
}

}
class MyThread3 extends Thread{
    public void run(){
        //System.out.println("i am Thread");
        for(int k=0;k<=5;k++){
            System.out.println("i am Thread3"+ k);
        }
        System.out.println("Exit from Thread3");
}

}
class DemoThread{
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        t2.setPriority(10);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Exit from main Thread");
    }
}