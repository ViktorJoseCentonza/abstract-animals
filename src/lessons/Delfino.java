package lessons;

import lessons.interfaces.INuotante;

public class Delfino extends Animale implements INuotante {

    String name;
    String says;
    String eats;

    public Delfino(String name, String says, String eats) {
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
    public void nuota() {
        System.out.println("sto nuotando!");
    }
}
