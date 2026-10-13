
import java.awt.*;
import java.awt.event.*;

class Event extends Frame implements ActionListener {

    TextField tf = new TextField();

    Event() {
        tf.setBounds(60, 50, 170, 20);

        Button b = new Button("Show");
        b.setBounds(100, 150, 75, 40);

        b.addActionListener(this);

        add(b);
        add(tf);

        setSize(250, 250);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("Hello World");
    }

    public static void main(String[] args) {
        Event eh = new Event();
    }
}
