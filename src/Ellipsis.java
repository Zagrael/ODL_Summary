public class Ellipsis {
    // centre
    Point center;

    // demi grand-axe selon x
    int a;

    // semi grand-axe selon y
    int b;

    public Ellipsis(Point center, int a, int b) {
        this.center = center;
        this.a = a;
        this.b = b;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
