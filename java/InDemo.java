class A
{
   void s()
   {
    System.out.println("I am s of A");
   } 
}
class B extends A
{
    void k()
    {
        System.out.println("I am k of B");
       } 
}

class InDemo
{
    public static void main(String[] args) 
    {
        B ob = new B();
        ob.s();
        ob.k();
}
}