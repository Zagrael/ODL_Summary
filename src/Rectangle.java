public class Rectangle extends ConvexPolygon {
    // Constructeurs
    public Rectangle(){}

    public Rectangle(Point A, Point B) {
        vertices = new Point[4];
        vertices[0] = A;
        vertices[1] = new Point(A.getY(), B.getX());
        vertices[2] = B;
        vertices[3] = new Point(A.getX(), B.getY());
    }
}
