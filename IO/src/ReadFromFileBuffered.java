import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFileBuffered {
    public static void main(String[] args) {
        FileInputStream in;
        BufferedInputStream b1;

        try{
            in = new FileInputStream("IO/src/file1.txt");
            b1 = new BufferedInputStream(in);

            int b;
            while((b = b1.read()) != -1){
                System.out.print((char) b);
            }

            b1.close();
            in.close();

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
