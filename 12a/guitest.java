import javax.swing.*;
import java.awt.*;


public class guitest {
    public static void main(String[] args){
        JFrame frame = new JFrame("Simple Button");
        Container display = frame.getContentPane();
        JButton submit = new JButton("Submit");
        display.add(submit);
        submit.addActionListener(new Echo());
        frame.pack();
        frame.setVisible(true);




    }
}
