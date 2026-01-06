import java.awt.*;
import java.awt.event.*;

public class EventAdapter extends Frame{

    TextField tf;

    public EventAdapter(){

        setSize(500,500);
        setTitle("Adapter");
        setLayout(new FlowLayout());
        setVisible(true);

        tf = new TextField(10);

        add(tf);


        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               tf.setText("Mouse Clicked");
            }
        });

    }
}

//class A {
//    public void display(){
//        System.out.println("From A");
//    }
//}
//
//class B extends A {
//    @Override
//    public void display() {
//        System.out.println("From B");
//    }
//}

class MainAdapter {
    public static void main(String[] args) {
        EventAdapter e = new EventAdapter();

//        A obj;
//        obj = new A();
//        obj.display();
    }
}
