public class Sphere {
    private double radius;
    Sphere(double rad){radius = rad;}
    public double calkfullsurf(){return 4*Math.PI*radius*radius;}
    public double calkvol(){return 4/3*Math.PI*radius*radius*radius;}

    public void show(){
        System.out.print(" rad "+radius);
        System.out.print(" vol "+calkvol());
        System.out.print(" surf "+calkfullsurf());
    }
}
