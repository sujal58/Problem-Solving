import java.awt.*;

class MyCanvas extends Canvas {
    @Override
    public void paint(Graphics g) {
        int x = 0;
        int y = 0;

        for (int i = 1; i <= 8; i++) {
            x = 0;
            Color color1 = Color.BLACK;
            for (int j = 1; j <= 8; j++) {

                if (i % 2 != 0 && j % 2 != 0) {
                    color1 = Color.black;

                }

                if (i % 2 != 0 && j % 2 == 0) {
                    color1 = Color.WHITE;

                }

                if (i % 2 == 0 && j % 2 == 0) {
                    color1 = Color.black;

                }

                if (i % 2 == 0 && j % 2 != 0) {
                    color1 = Color.WHITE;

                }

                g.setColor(color1);
                g.fillRect(x, y, 100, 80);

                x = x + 100;
            }
            y = y + 80;
        }
    }
}

public class graphics {
    public static void main(String[] args) {
        Frame frame = new Frame("Graphics");
        MyCanvas c = new MyCanvas();
        // c.setSize(500, 400);
        frame.setBackground(Color.blue);
        frame.add(c);
        frame.setSize(800, 600);
        frame.setVisible(true);

    }
}