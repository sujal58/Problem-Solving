import java.awt.*;

class MyCanvas extends Canvas {
    @Override

    public void paint(Graphics g) {
        g.drawLine(100, 100, 200, 200);
        // g.fillRect(0, 0, 200, 200);
    }

}

public class graphicsturtle {
    public static void main(String[] args) {
        Frame frame = new Frame("Turtle");
        MyCanvas c = new MyCanvas();
        // frame.setBackground(Color.black);
        frame.add(c);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
