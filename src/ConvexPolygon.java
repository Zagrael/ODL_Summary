public class ConvexPolygon {
    protected Point[] vertices;

    // Constructeurs
    public ConvexPolygon(){}

    public ConvexPolygon(Point p[]) {
        vertices = new Point[p.length];

        for (int i = 0; i < p.length; i++)
            vertices[i] = new Point(p[i]);
    }

    // Getters
    public Point[] getVertices() {
        return vertices;
    }

    // Setters
    public void setVertices(Point[] vertices) {
        this.vertices = vertices;
    }
}
