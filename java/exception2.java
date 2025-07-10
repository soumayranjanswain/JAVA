import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Ad {
    void s()throws FileNotFoundException
    {
        FileInputStream fin=new FileInputStream("d:/text");
    }
}
class exception2{
    public static void main(String[] args)throws FileNotFoundException {
        System.out.println("1");
        Ad ob=new Ad();
        System.out.println("2");
        try{
        ob.s();
        }catch(Exception e){}
        System.out.println("3");
    }
}
