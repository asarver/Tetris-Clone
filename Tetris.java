import javax.swing.JFrame;

public class Tetris {
    public static int WINDOW_HEIGHT = 480;
    public static int WINDOW_WIDTH = 640;

    public static void main (String [] args) {
        JFrame window = new JFrame();
        window.setTitle("Tetris");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setVisible(true);
    }
}
