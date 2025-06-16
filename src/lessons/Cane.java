package lessons;

public class Cane extends AbstractAnimale {

    String name;
    String says;
    String eats;

    public Cane(String name, String says, String eats) {
        this.name = name;
        this.says = says;
        this.eats = eats;
    }

    @Override
    void verso() {
        System.out.println(this.says);
    }

    @Override
    void mangia() {
        System.out.println("mangia: " + this.eats);
    }
}
