package lessons;

import lessons.interfaces.INuotante;

public class Delfino extends AbstractAnimale implements INuotante {

    @Override
    public void verso() {
        System.out.println("*rumori da delfino*");
    }

    @Override
    public void mangia() {
        System.out.println("presci e crostacei");
    }

    @Override
    public void nuota() {
        System.out.println("sto nuotando!");
    }
}
