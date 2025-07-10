interface A {
    void s();
}
interface B{
    void d();
}
class Foo{
    void xc(){
        System.out.println("i am FOO");
    }
}
class DI  extends Foo implements A,B {
   public  void s(){
        System.out.println("i am implemented S");
    }
    public  void d(){
        System.out.println("i am implemented D");
    }
}
class Interface{
    public static void main(String args[]){
        DI ob=new DI();
        ob.s();
        ob.xc();
    }
}
