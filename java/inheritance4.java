class A
{
   protected int x;

}
class B extends A
{
   void k(){
     System.out.println("child x="+x);
   }
}

class inheritance4
{
    public static void main(String[] args) 
    {
        B ob = new B();
        ob.x=35;
        ob.k();

}
}
