
import java.awt.*;
import java.awt.event.*;

public class EventHandling extends Frame implements ActionListener {

    TextField a;
    Button b;

    EventHandling() {
        a = new TextField();
        a.setBounds(60, 100, 200, 30);

        b = new Button("Click Me");
        b.setBounds(100, 150, 100, 40);

        b.addActionListener(this);

        add(a);
        add(b);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        a.setText("Button clicked!");
    }

    public static void main(String[] args) {
        new EventHandling();
    }
}
