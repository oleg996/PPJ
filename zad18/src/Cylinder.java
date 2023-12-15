public class Cylinder {
    private int  radius,height;



    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public double calcbotoomsurf(){return StrictMath.PI *radius*radius;}
    public double calksidesurf(){return 2*StrictMath.PI *radius*height;}
    public double calkfullsurf(){return this.calcbotoomsurf()*2+this.calksidesurf();}
    public double calkvol(){return this.calcbotoomsurf()*height;}

    public double calkrad(){return radius;}
    public double caldia(){return Math.sqrt(Math.pow(2*radius,2)+Math.pow(height,2));}
     public void show(){
        System.out.print(" rad "+radius);
        System.out.print(" hei "+height);
        System.out.print(" vol "+calkvol());
        System.out.print(" surf "+calkfullsurf());
    }
}
