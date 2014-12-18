package gui;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Samuel on 2014/11/24.
 */
public class MyMouseAdapter {
    public static void main(String[] args){
        new MyFrame("drawing...");
    }
}

class MyFrame extends Frame {
    ArrayList<Point> points = null;
    MyFrame(String s){
        super(s);
        points = new ArrayList<Point>();
        setLayout(null);
        setBounds(100, 100, 400, 300);
        this.setBackground(new Color(204, 204, 255));
        setVisible(true);
        this.addMouseListener(new Monitor());
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.out.println("Closing!");
                System.exit(0);
            }

            public void windowClosed(WindowEvent e){
                System.out.println("I am closed!");
            }
        });
    }

    public void paint(Graphics g){
        Iterator<Point> i = points.iterator();
        while(i.hasNext()){
            Point p = (Point) i.next();
            g.setColor(Color.red);
            g.fillOval(p.x, p.y, 10, 10);
        }
    }

    public void addPoint(Point p){
        points.add(p);
    }
}

class Monitor extends MouseAdapter {
    public void mousePressed(MouseEvent e){
        MyFrame f = (MyFrame)e.getSource();
        f.addPoint(new Point(e.getX(), e.getY()));
        f.repaint();
    }
}

//class WindowMonitor extends WindowAdapter {
//    public void windowClosing(WindowEvent e){
//        System.exit(0);
//    }
//}