public class Prism extends Tria {
    private double h ;

    public Prism(double a, double h) {
        super(a);
        this.h = h;
    }
    public Prism(Tria p, double h) {
        super(p.getA());
        this.h = h;
    }


    public double getH() {
        return h;
    }


    public double getSurf() {
        return (super.getSurf()*2)+ (super.getA()*h*3);
    }
    public  double getVol(){
        return (super.getSurf()*h);
    }
}
