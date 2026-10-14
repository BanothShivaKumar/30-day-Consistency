import java.awt.*;
public class grid {
    public static void main(String[] args) {
        Frame s=new Frame();
        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        Button b4=new Button("4");
        Button b5=new Button("5");
        Button b6=new Button("6");
        Button b7=new Button("7");
        Button b8=new Button("8");
        Button b9=new Button("9");
        s.setLayout(new GridLayout(4,4,2,2));
        b1.setBackground(Color.blue);
        b2.setBackground(Color.blue);
        b3.setBackground(Color.blue);
        b4.setBackground(Color.blue);
        b5.setBackground(Color.pink);
        b6.setBackground(Color.pink);
        b7.setBackground(Color.pink);
        b8.setBackground(Color.pink);
        b9.setBackground(Color.pink);
        s.add(b1);
        s.add(b2);
        s.add(b3);
        s.add(b4);
        s.add(b5);
        s.add(b6);
        s.add(b7);
        s.add(b8);
        s.add(b9);
        s.setVisible(true);
        s.setSize(800, 800);
    }
}
