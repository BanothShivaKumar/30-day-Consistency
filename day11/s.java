import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
public class s {
    s()
    {
        JFrame a=new JFrame("My window");
        Button b1=new Button("New Button ");
        b1.setBackground(Color.blue);
        a.add(b1);
        a.setLayout(new GridLayout());
        b1.setSize(10,10);
        a.setSize(500, 500);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        a.setVisible(true);
    }
    public static void main(String[] args) {
        s a=new s();
    }
}
