 final class A {
    void s(){
        System.out.println("i am s of A");
    }
}
class B extends A{

}
class Method{
    public static void main(String[] args) {
        B ob=new B();
        ob.s();
    }
}
