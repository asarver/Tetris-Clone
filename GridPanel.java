import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class GridPanel extends JPanel {
    public static final int BLOCK_WIDTH = 20;
    public static final int BLOCK_HEIGHT = 20;
    public static final Color BLOCK_COLOR = Color.BLUE;
    public static final Color BACKGROUND_COLOR = Color.BLACK;
        
    public GridPanel() {
        setBackground(BACKGROUND_COLOR);
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawBlockAt(g, 5, 5, BLOCK_COLOR); 
    }

    private void drawBlockAt(Graphics g, int x, int y, Color blockColor) {
        g.setColor(blockColor);
        g.fillRect(x * BLOCK_WIDTH, y * BLOCK_HEIGHT,
                   BLOCK_WIDTH, BLOCK_HEIGHT);
    }
}
