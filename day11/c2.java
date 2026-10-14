
import java.awt.*;
import java.awt.event.*;

public class c2 extends Frame implements MouseListener {
    Label l;

    c2() {
        l = new Label("Perform a mouse action");
        l.setBounds(40, 40, 250, 30);

        add(l);
        addMouseListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse clicked");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse released");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse exited");
    }
}

public class c2 {
    public static void main(String[] args) {
        c2 a = new c2();
    }
}
