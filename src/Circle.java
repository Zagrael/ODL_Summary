public class Circle extends Ellipsis {
    // Rayon
    int radius;

    public Circle(Point center, int a, int b) {
        super(center, a, b);
    }

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
