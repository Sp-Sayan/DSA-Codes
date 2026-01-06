import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        FileOutputStream outputStream;
        String str = "This is written from WriteToFile class.";
        try{
            outputStream = new FileOutputStream("IO/src/file1.txt", true);
            //write to a file
            byte[] arr = str.getBytes();
            outputStream.write(arr);
            System.out.println("Written");
            outputStream.close();
        } catch (IOException e){
            System.out.println("Exception caught");
        }
    }
}
