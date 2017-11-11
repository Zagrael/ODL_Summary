public class Point {
    int x;
    int y;

    // Constructeurs
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point P) {
        this.x = P.getX();
        this.y = P.getY();
    }

    // Getters
    public int getX() {

        return x;
    }

    public int getY() {
        return y;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
