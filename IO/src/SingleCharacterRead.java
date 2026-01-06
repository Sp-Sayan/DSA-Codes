import java.io.FileReader;
import java.io.IOException;

public class SingleCharacterRead {
    public static void main(String[] args) {
        FileReader fr;

        try {
            fr = new FileReader("IO/src/file1.txt");
            //single character
            System.out.println((char)fr.read());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
