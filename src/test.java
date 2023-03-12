import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class test extends JFrame {

    //how to print

    private ArrayList<Point> points = new ArrayList<Point>();
    private Color currentColor = Color.BLACK;

    public test() {
        enableEvents(java.awt.AWTEvent.MOUSE_EVENT_MASK);
        enableEvents(java.awt.AWTEvent.MOUSE_MOTION_EVENT_MASK);
        setTitle("Simple Paint App");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(currentColor);
        for (Point p : points) {
            g.setColor(getRandomColor());
            g.fillRect(p.x, p.y, 10, 10);
        }
    }

    protected void processMouseEvent(MouseEvent e) {
        if (e.getID() == MouseEvent.MOUSE_CLICKED) {
            if (e.getButton() == MouseEvent.BUTTON3) {
                currentColor = getRandomColor();
            } else {
                points.add(new Point(e.getX(), e.getY()));
            }
            repaint();
        }
    }

    protected void processMouseMotionEvent(MouseEvent e) {
        if (e.getID() == MouseEvent.MOUSE_DRAGGED) {
            points.add(new Point(e.getX(), e.getY()));
            repaint();
        }
    }

    private Color getRandomColor() {
        Random random = new Random();
        int r = random.nextInt(250);
        int g = random.nextInt(250);
        int b = random.nextInt(250);
        return new Color(r, g, b);
    }

    public static void main(String[] args) {
        test app = new test();
    }
}