class A
{
  A(int a){
    System.out.println("i am parent constructor");
  }
  }
class B extends A
{
   B(int a,int b){
    super(3);
       System.out.println("i am child constructor");
   }
}

class inheritance6
{
    public static void main(String[] args) 
    {
      B ob=new B(2,3);
    }
}

