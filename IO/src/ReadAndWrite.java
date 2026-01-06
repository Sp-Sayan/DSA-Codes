import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWrite {
    public static void main(String[] args) {
        FileInputStream in;
        FileOutputStream out;

        try{
            in = new FileInputStream("IO/src/file1.txt");
            out = new FileOutputStream("IO/src/file2.txt");

            //read from file1
            String str = "";
            int b;
            while((b = in.read())!= -1){
                str += (char)b;
            }

            //write to file2
            byte[] arr = str.getBytes();
            out.write(arr);

            System.out.println("Written");

            in.close();
            out.close();

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
