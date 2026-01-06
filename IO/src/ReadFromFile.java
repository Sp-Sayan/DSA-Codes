import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile {

    public static void main(String[] args) {
        FileInputStream inputStream;

        try{
            inputStream = new FileInputStream("IO/src/file1.txt");
            //read from a file
            int b;
            while((b=inputStream.read()) != -1){
                System.out.print((char) b);
            }
            System.out.println();
            inputStream.close();
        } catch (IOException e){
            System.out.println("Exception caught");
        }
    }
}
