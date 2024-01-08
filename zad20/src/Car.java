public class Car {
    private String name;
    private float fuelLevel;

    private final float fec = 10; // km na unit paliva
    public Car(String name, float fuelLevel) {
        this.name = name;
        this.fuelLevel = fuelLevel;
    }
    public void drive(double lenght){
        double maxdist = fuelLevel* fec;
        System.out.print("Your "+ name+" ");
        if (maxdist>lenght){
            System.out.print(" can drive to destination "+(maxdist-lenght)+" leftover km\n");
        }else {
            System.out.print(" can't drive to destination will need a refuel at "+maxdist+" km \n");
        }

    }
}
