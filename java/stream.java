import java.io.*;
class stream{
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream fin = new FileInputStream("C:\\soumya.text\\soumya.text.txt");
            int value = fin.read();
            while((value=fin.read())!=-1){
                System.out.println(value+"");
            }
            System.out.println(value);
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

