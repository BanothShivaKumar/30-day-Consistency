import javax.swing.JFrame;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import java.awt.Event.*;
import java.awt.*;
import javax.swing.JScrollBar;
public class s1 {
    s1()
    {
        Frame f=new Frame();
        JScrollBar a=new JScrollBar();
        a.setBounds(90,90,40,90);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(a);
        f.setVisible(true);
        f.setSize(200,200);
        f.setLayout(new BorderLayout());
    }
    public static void main(String[] args) {
        s1 c=new s1();
    }
}
