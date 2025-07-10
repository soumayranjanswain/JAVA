//  class test {
//      static int x=1;
//     static void s(){
//      System.out.println("i am static s"+x);
//     }
    
// }
// class Demo
// {
//     public static void main(String args[]){
//         test t1=new test();
//         test t2=new test();
//         t1.s();
//         t2.s();
//     }
// }

// 




// class test{
//     static{
//         System.out.println("i am a static block");
//         System.exit(0);

//     }
// }


class test{
    static{
        System.out.println("i am a static block");
       

    }
}
class Demo{
    public static void main(String[] args)throws ClassNotFoundException {
        Class.forName("test");
    }
}
