import java.io.*;
class stream2{
    public static void main(String[] args) {
        try{
            String filepath="C:\\soumya.text\\soumya.text.txt";
            FileOutputStream fos=new FileOutputStream(filepath,true);
            String str="futuretecheduction.com";
            byte bytearray[]=str.getBytes();

            fos.write(bytearray);
        
            fos.close();
            System.out.println("successfully written");
        }catch(Exception e){
            System.out.println(e);
        }

    }
}