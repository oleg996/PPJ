public class Donkey {
    double weight;
    ballon[] ballons ={};
    Donkey(double sweight){
        weight = sweight;
    }
    double getTotallift(){
        double totallift = 0;
        for (int i = 0; i < ballons.length; i++) {
            totallift += ballons[i].getlift();
        }
        return totallift;
    }
    boolean isFlying(){
        return weight<=this.getTotallift();
    }
    void addbaloon(int am){
        System.out.println("added "+am+" balons total:"+ballons.length);
        ballon[] tmp = ballons;
        ballons = new ballon[tmp.length+am];
        for (int i = 0; i < tmp.length; i++) {
            ballons[i] = tmp[i];
        }
        for (int i = 0; i < am; i++) {
            ballons[tmp.length+i] = new ballon();
        }
    }
}
