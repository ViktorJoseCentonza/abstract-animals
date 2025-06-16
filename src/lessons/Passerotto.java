package lessons;

import lessons.interfaces.IVolante;

public class Passerotto extends AbstractAnimale implements IVolante {

    String name;
    String says;
    String eats;

    public Passerotto(String name, String says, String eats) {
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

    @Override
    public void vola() {
        System.out.println("sto volando!");
    }
}
