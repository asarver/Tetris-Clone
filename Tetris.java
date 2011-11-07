import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tetris {
    public static int WINDOW_HEIGHT = 480;
    public static int WINDOW_WIDTH = 640;

    public static void main (String [] args) {
        JPanel gamePanel = new GridPanel();

        JFrame window = new JFrame();
        window.getContentPane().add(gamePanel);
        window.setTitle("Tetris");
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
