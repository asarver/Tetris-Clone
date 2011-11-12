import java.awt.Point;

public abstract class Tetrad {

    protected Point[] blocks;

    public Tetrad() {
        blocks = new Point[4];
    }

    public void moveRight() {
        for (Point block : blocks) {
            block.x++;
        }
    }
    
    public void moveLeft() {
        for (Point block : blocks) {
            block.x--;
        }
    }
    
    public void moveDown() {
        for (Point block : blocks) {
            block.y++;
        }
    }

    public Point[] getBlocks() {
        return blocks;
    }

    public abstract void rotateClockwise();
    public abstract void rotateCounterClockwise();
}

class O extends Tetrad {

    public O() {
        this(0, 0);
    }

    public O(int x, int y) {
        blocks[0] = new Point(x, y);
        blocks[1] = new Point(x + 1, y);
        blocks[2] = new Point(x, y + 1);
        blocks[3] = new Point(x + 1, y + 1);
    }

    public void rotateClockwise() {
        return;
    }

    public void rotateCounterClockwise() {
        return;
    }
}
