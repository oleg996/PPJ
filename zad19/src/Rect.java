public class Rect {
    private double a,b;

     Rect(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getSurf(){
        return a*b;
    }
    public double getA(){
        return a;
    }

    public double getB() {
        return b;
    }
}
