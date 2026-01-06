import java.awt.*;
import java.awt.event.*;
public class EventHandle extends Frame implements ActionListener,ItemListener,MouseMotionListener,MouseListener {


    Button b;
    TextField tf;
    Checkbox c1;

    public EventHandle(){

        //Frame settings
        setTitle("Test Frame");
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());

        //create instances of components
        b = new Button("Click");
        tf = new TextField(10);
        c1 = new Checkbox("hello", null,false);

        //add components
        add(b);
        add(tf);
        add(c1);

        //register event listeners
        b.addActionListener(this);
        c1.addItemListener(this);
        addMouseMotionListener(this);
        addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //prints "Click" in the text field
        String str = e.getActionCommand();
        tf.setText(str);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        if(c1.getState()){
            //body
            tf.setText(c1.getLabel());
        } else {
            tf.setText("");
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //shows X coordinate in text field
        tf.setText("Dragged: " + e.getX());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //shows X coordinate in text field
        tf.setText("Moved: " + e.getX());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //one click
        tf.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //long press
        tf.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        tf.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //mouse enters frame
        tf.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //mouse exits frame
        tf.setText("Mouse Exited");
    }
}

class Main{
    public static void main(String[] args) {
        EventHandle event = new EventHandle();

    }
}
