public class SphereOUT extends Sphere {

    SphereOUT(Rect rec){
        super(rec.Side()*Math.sqrt(2)/2);
    }
    SphereOUT(Cylinder cul){
        super(cul.caldia()/2);
    }
}
