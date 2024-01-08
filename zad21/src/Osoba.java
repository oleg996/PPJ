public class Osoba {
    String name;
    int age;

    public Osoba(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
