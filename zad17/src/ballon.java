public class ballon {
    double vol = 0;
    ballon(){
         vol = Math.random()*0.005d+0.004d;

    }
    double getlift(){
        return (vol/0.007d)*0.006d;
    }
}
