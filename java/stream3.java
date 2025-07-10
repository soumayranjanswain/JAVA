import java.io.*;
class stream3{
    public static void main(String[] args) {
        try{
           DataInputStream dis=new DataInputStream(System.in);
           String filepath="C:\\soumya.text\\soumya.text.txt";
           FileOutputStream fos=new FileOutputStream(filepath);
           System.out.println("Enter the text(@at the end)");
           int value=0;
           while ((value=dis.read())!='@') {
              char ch=(char)value;
              fos.write(ch);
           }
           fos.close();
           System.out.println("successfully written...");
        }
        catch(Exception e){
            System.out.println(e);
        }
        }
    }