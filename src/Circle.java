public class Circle extends Ellipsis {
    // Rayon
    int radius;

    // Constructeurs
    public Circle(Point C, int radius) {
        this.center = C;
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
