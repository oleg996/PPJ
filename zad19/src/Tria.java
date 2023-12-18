public class Tria {
    double a;

    public Tria(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }
    public double getSurf(){
        return ((a*a)*Math.sqrt(3)/4);
    }
}
