import java.awt.Frame;
import javax.swing.JComboBox;

public class c {
    c()
    {
        Frame f=new Frame("My window");
        String cols[]={"java","python","c++"};
        JComboBox a=new JComboBox(cols);
        a.setBounds(50,50,100,50);
        f.add(a);
        f.setVisible(true);
        f.setSize(500,500);
    }
    public static void main(String args[])
    {
        c obj=new c();
    }
}
