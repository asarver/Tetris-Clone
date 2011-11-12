import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.util.*;
import java.awt.Point;

public class GridPanel extends JPanel {
    public static final int BLOCK_WIDTH = 15;
    public static final int BLOCK_HEIGHT = 15;
    public static final Color BLOCK_COLOR = Color.BLUE;
    public static final Color BACKGROUND_COLOR = Color.GRAY;
    private HashMap<Color, ArrayList<Point>> pixelsToPaint;    
    
    
    public GridPanel() {
        setBackground(BACKGROUND_COLOR);
        pixelsToPaint = new HashMap<Color, ArrayList<Point>>();
    }

    public void paint(Graphics g) {
        super.paint(g);

        for (Color c : pixelsToPaint.keySet()) {
            ArrayList<Point> list = pixelsToPaint.get(c);

            for (Point p : list) {
                drawBlockAt(g, p.x, p.y, c);
            }
        }
        pixelsToPaint.clear();
    }

    public void drawBlocks(Point[] blocks, Color c) {
        if (!pixelsToPaint.containsKey(c)) {
            pixelsToPaint.put(c, new ArrayList<Point>());
        }

        ArrayList<Point> list = pixelsToPaint.get(c);
       
        for (Point p : blocks) {
            list.add(p);
        }
    }

    private void drawBlockAt(Graphics g, int x, int y, Color blockColor) {
        g.setColor(blockColor);
        g.fillRect(x * BLOCK_WIDTH, y * BLOCK_HEIGHT,
                   BLOCK_WIDTH, BLOCK_HEIGHT);
        g.setColor(blockColor.darker());
        g.drawRect(x * BLOCK_WIDTH, y * BLOCK_HEIGHT,
                   BLOCK_WIDTH, BLOCK_HEIGHT);
    }
}
