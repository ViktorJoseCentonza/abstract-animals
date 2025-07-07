package lessons;

import lessons.interfaces.IVolante;

public class Aquila extends AbstractAnimale implements IVolante {
    @Override
    public void verso() {
        System.out.println("kaw kaw");
    }

    @Override
    public void mangia() {
        System.out.println("roditori e serpenti");
    }

    @Override
    public void vola() {
        System.out.println("sto volando!");
    }
}
