public class Circle extends Ellipsis {
    // Rayon
    int radius;

    // Constructeurs
    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // Getters
    public int getRadius() {
        return radius;
    }

    // Setters
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
