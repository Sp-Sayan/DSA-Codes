import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFileBuffered {
    public static void main(String[] args) {
        FileOutputStream out;
        BufferedOutputStream b2;

        String str = "This is written from WriteToFileBuffered class.";

        try{
            out = new FileOutputStream("IO/src/file1.txt", true);
            b2 = new BufferedOutputStream(out);

            byte[] arr = str.getBytes();
            b2.write(arr);

            b2.close();
            out.close();
            System.out.println("Written");

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
