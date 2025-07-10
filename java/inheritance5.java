class A
{
  int i=12;
  void s(){
    System.out.println("i="+i);
  }

}
class B extends A
{
    int i=56;
   void k(){
     System.out.println("child I="+i);
     System.out.println("parent I="+super.i);
   }
}

class inheritance5
{
    public static void main(String[] args) 
    {
        B ob = new B();
        ob.k();
        

}
}
