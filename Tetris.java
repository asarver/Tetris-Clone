import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Point;
import java.awt.Color;
import java.lang.Thread;

public class Tetris {
    public static int WINDOW_HEIGHT = 480;
    public static int WINDOW_WIDTH = 640;

    public static void main (String [] args) {
        GridPanel gamePanel = new GridPanel();

        JFrame window = new JFrame();
        window.getContentPane().add(gamePanel);
        window.setTitle("Tetris");
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        Animation a = new Animation(gamePanel);
        a.start();
    }
}

class Animation extends Thread {
    
    private GridPanel panel;

    public Animation (GridPanel gamePanel) {
        panel = gamePanel;    
    }

    public void run() {
        Tetrad blockO = new O(5,5);
        while (true) {
            blockO.moveDown();
            Point[] blocks = blockO.getBlocks();
            panel.drawBlocks(blocks, Color.BLUE); 
            panel.repaint();
            try {
                sleep(500);
            } catch (Exception e) {}
        }
    }
}
