public class Square extends Rectangle {
    int size;

    // Constructeurs
    public Square(Point A, int c) {
        vertices = new Point[4];
        vertices[0] = A;
        vertices[1] = new Point(A.getX() + c, A.getY());
        vertices[2] = new Point(A.getX() + c, A.getY() - c);
        vertices[3] = new Point(A.getX(), A.getY() - c);

        this.size = c;
    }
}
