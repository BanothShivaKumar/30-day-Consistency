
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
public class layout {
    public static void main(String[] args) {
        Frame s=new Frame();
        Button b1=new Button("First");
        Button b2=new Button("second");
        Button b3=new Button("third");
        Button b4=new Button("fourth");
        Button b5=new Button("fifth");
        b1.setBackground(Color.white);
        b2.setBackground(Color.red);
        b3.setBackground(Color.green);
        b4.setBackground(Color.yellow);
        b5.setBackground(Color.blue);
        s.setLayout(new BorderLayout());
        s.add(b1,BorderLayout.NORTH);
        s.add(b2,BorderLayout.SOUTH);
        s.add(b3,BorderLayout.EAST);
        s.add(b4,BorderLayout.WEST);
        s.add(b5,BorderLayout.CENTER);
        s.setVisible(true);
        s.setSize(1200, 1200);

    }
}
