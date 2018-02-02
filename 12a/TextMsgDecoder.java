

/**
 * Created by JeffreyYang on 10/9/17.
 */
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
public class TextMsgDecoder {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("dank");
        frame.setSize(200,200);
        JButton x = new JButton("click here for submitted");
        frame.add(x);
        x.addActionListener(new Echo());
        frame.setVisible(true);

    }

}
