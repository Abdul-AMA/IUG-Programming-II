package Labs.Lab04;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class MSPaint  extends JFrame{

    Random random = new Random();
    private ArrayList<Point> points = new ArrayList<Point>();

    public MSPaint()  {
        enableEvents(java.awt.AWTEvent.MOUSE_MOTION_EVENT_MASK);
        setTitle("Simple Paint App");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        for (Point p : points) {
            g.fillRect(p.x, p.y, 5, 5);
            g.setColor(new Color(random.nextInt(250),random.nextInt(250),random.nextInt(250)));

        }
    }


    protected void processMouseMotionEvent(MouseEvent e) {
        if (e.getID() == MouseEvent.MOUSE_DRAGGED) {
            points.add(new Point(e.getX(), e.getY()));
            repaint();
        }
    }

}