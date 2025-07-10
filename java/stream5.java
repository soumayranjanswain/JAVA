import java.io.*;
class stream5{
    public static void main(String[] args)throws IOException{
        try{
            FileInputStream fis=new FileInputStream("C:\\soumya.text\\soumya.text.txt");
            BufferedInputStream bis=new BufferedInputStream(fis);
            int i=0;
            while((i=bis.read())!=-1){
                char ch=(char)i;
                System.out.println(ch);
            }
            bis.close();
            fis.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}