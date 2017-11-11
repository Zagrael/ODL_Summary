public class Rectangle extends ConvexPolygon {
    int width;
    int height;

    // Constructeurs
    public Rectangle(){}

    public Rectangle(Point A, Point B) {
        vertices = new Point[4];
        vertices[0] = A;
        vertices[1] = new Point(A.getY(), B.getX());
        vertices[2] = B;
        vertices[3] = new Point(A.getX(), B.getY());

        width = (Math.abs(B.getX() - A.getX()) <= Math.abs(B.getY() - A.getY())) ? Math.abs(B.getX() - A.getX()) : Math.abs(B.getY() - A.getY());
        height = (Math.abs(B.getX() - A.getX()) >= Math.abs(B.getY() - A.getY())) ? Math.abs(B.getX() - A.getX()) : Math.abs(B.getY() - A.getY());
    }

    // Getters
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // Setters
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
