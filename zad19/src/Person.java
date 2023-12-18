import java.time.LocalDateTime;
import java.util.Locale;

public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    public  Person(String nam){
        this(nam,1990);
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return LocalDateTime.now().getYear()- birthYear;
    }
    public static Person getOldest(Person[] tab){
        Person tmp = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tmp.getAge()<tab[i].getAge()){
                tmp = tab[i];
            }
        }
        return tmp;
    }
    public static Person getYongest(Person[] tab){
        Person tmp = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tmp.getAge()>tab[i].getAge()){
                tmp = tab[i];
            }
        }
        return tmp;
    }
    public static Person getOldest(Person a,Person b ){
        return a.getAge()< b.getAge() ?b:a;

    }
}
