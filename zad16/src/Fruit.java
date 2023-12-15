public class Fruit {
    String name;
    double weinght;
    Fruit(String n){
        name = n ;
        weinght = Math.random()*0.3+0.5;

    }
    void show(){
        System.out.println("A "+this.name);
        System.out.println("Weight "+this.weinght);
        System.out.println("==========================");

    }
}
