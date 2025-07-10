class A
{
    int x=10;
  void s()
  {
    System.out.println("Parent x="+x);
  }
}
class B extends A
{
    void k()
    {
        System.out.println("Child x="+x);
       } 
}

class inheritance2
{
    public static void main(String[] args) 
    {
        B ob = new B();
        ob.s();
        ob.k();

}
}
