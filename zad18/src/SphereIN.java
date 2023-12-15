public class SphereIN extends Sphere{


    SphereIN(Rect rec){
        super(rec.Side()/2);
    }
    SphereIN(Cylinder cul){
        super(cul.calkrad());
    }

}
