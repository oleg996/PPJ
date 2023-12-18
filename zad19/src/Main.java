public class Main {
    public static void main(String[] args) {
Person[] family = {
        new Person("oleg",2006),
        new Person("Katia",1990),
        new Person("Ola",2020)
};
        System.out.println(family[0].getName());
        System.out.println(Person.getYongest(family).getAge());
        }
}