import java.awt.*;
public class card {
    public static void main(String[] args) {
    Frame f=new Frame();

    Button b2=new Button("2");
    Button b3=new Button("3");
    Button b4=new Button("4");
    Button b5=new Button("5");
    f.setLayout(new CardLayout(20,20));
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(b5);
    f.setVisible(true);
    f.setSize(500,500);
}
}
