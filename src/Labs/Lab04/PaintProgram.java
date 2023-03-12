package Labs.Lab04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class PaintProgram extends JFrame {
    private ArrayList<Point> points;
    private JPanel canvas;

    Random random = new Random();
    public PaintProgram() {
        points = new ArrayList<>();

        canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(random.nextInt(250), random.nextInt(250), random.nextInt(250)));
                for (int i = 0; i < points.size() - 1; i++) {
                    Point p1 = points.get(i);
                    Point p2 = points.get(i + 1);
                    g.drawLine(p1.x, p1.y, p2.x, p2.y);
                }
            }
        };

        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    // If right mouse button is pressed, clear the canvas
                    points.clear();
                    canvas.repaint();
                } else {
                    // Otherwise, add the current point to the points list
                    points.add(e.getPoint());
                }
            }
        });

        canvas.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
                    // If right mouse button is dragged, clear the canvas
                    points.clear();
                    canvas.repaint();
                } else {
                    // Otherwise, add the current point to the points list and repaint the canvas
                    points.add(e.getPoint());
                    canvas.repaint();
                }
            }
        });

        getContentPane().add(canvas, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PaintProgram();
    }
}