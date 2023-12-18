public class Box extends Rect {
    private double h;
    public Box(double a, double b, double he ) {
        super(a, b);
        h = he;
    }
    public Box(Rect p , double he ) {
        super(p.getA(), p.getB());
        h = he;
    }

    public double getH() {
        return h;
    }


    public double getSurf() {
    return( (super.getSurf()*2)+(super.getA()*2*h)+(super.getB()*2*h));
    }
    public double getVol(){
        return super.getSurf()*h;
    }
}
