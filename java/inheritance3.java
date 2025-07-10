class A
{
   private int x;
      void s()
   {
    x=23;
    System.out.println("x="+x);
   }
  
}
class B extends A
{
   
}

class inheritance3
{
    public static void main(String[] args) 
    {
        A ob = new B();
        ob.s();

}
}