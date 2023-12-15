public class Rect {
    private double bok = 0;

    public  Rect(int side){
        bok = side;

    }

    public double Vol() {return bok*bok;}
    public double Surf(){return this.Vol()*bok;}
    public double Side(){return bok;}
    public void show(){
        System.out.println("Surf "+Surf()+" Vol "+Vol()+" Side "+bok);
    }
}
