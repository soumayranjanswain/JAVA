import java.io.*;
class stream4{
    public static void main(String[] args)throws IOException{
        try{
FileReader fr=new FileReader("C:\\soumya.text\\soumya.text.txt");
int i;
while((i=fr.read())!=-1)
{
    System.out.println((char)i);
}
System.out.println("");
fr.close();
        }
        catch(Exception e){
            System.out.println(e);
    }
}
}

