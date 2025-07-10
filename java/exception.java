import java.io.FileInputStream;
import java.io.FileNotFoundException;

class exception{
    public static void main(String[] args)throws FileNotFoundException
    {
        System.out.println("Before exception");
        try{
            FileInputStream fin=new FileInputStream("d:/abc.text");
        }
        catch(Exception e){};
        System.out.println("After Exception");
    }
}
