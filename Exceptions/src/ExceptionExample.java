import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample{

    public static void demo(int age) throws IOException {
//        if (age < 18)
//            throw new RuntimeException();

        //delete a.txt to get an exception
        FileReader reader = new FileReader("Exceptions/src/a.txt");
        reader.close();
    }

    public static void main(String[] args) {
//        try{
//            demo(17);
//        } catch (RuntimeException e){
//            System.out.println("There's a Runtime exception");
//        }

        try{
            demo(1);
        } catch (IOException e){
            System.out.println("IO Exception found");
        }
        System.out.println("Program continues");
    }
}
