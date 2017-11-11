public class Ellipsis {
    // centre
    Point center;

    // demi grand-axe selon x
    int a;

    // semi grand-axe selon y
    int b;

    // Constructeurs
    public Ellipsis(){}

    public Ellipsis(Point center, int a, int b) {
        this.center = center;
        this.a = a;
        this.b = b;
    }

    // Getters
    public Point getCenter() {
        return center;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    // Setters
    public void setCenter(Point center) {
        this.center = center;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
