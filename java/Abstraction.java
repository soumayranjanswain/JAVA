//  abstract class A {
    
// abstract void s();
// void k(){
//     System.out.println("i am k of A");
// }
//  }
//  class B extends A{
//       void s(){
//         System.out.println("i am implemented s");
//       }
//  }
//  class Abstraction{
//     public static void main(String[] args) {
//             B ob=new B();
//             ob.s();
//         }

//  }



 abstract class Animal{
    void sleep(){
        System.out.println("sleeping now");
    }
abstract void sound();
}
class Dog extends Animal{
    void sound(){
        System.out.println("VooVoovoooo");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Miaun....miaun....");
    }
}
class Parrot extends  Animal{
    void sound(){
        System.out.println("mitu....mitu..mitu...");
    }
}
class Abstraction{
    public static void main(String[] args) {
        Dog dg=new Dog();
        Cat ct=new Cat();
        Parrot pt=new Parrot();
        dg.sound();
        ct.sound();
        pt.sound();
    }
}