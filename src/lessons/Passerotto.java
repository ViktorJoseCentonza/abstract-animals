package lessons;

import lessons.interfaces.IVolante;

public class Passerotto extends AbstractAnimale implements IVolante {

    @Override
    public void verso() {
        System.out.println("chip chip");
    }

    @Override
    public void mangia() {
        System.out.println("semini vari");
    }

    @Override
    public void vola() {
        System.out.println("sto volando!");
    }
}
