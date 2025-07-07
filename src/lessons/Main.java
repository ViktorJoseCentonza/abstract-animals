package lessons;

import lessons.interfaces.*;

public class Main {

    static void faiVolare(IVolante Animale) {
        Animale.vola();
    }

    static void faiNuotare(INuotante Animale) {
        Animale.nuota();
    }

    public static void main(String[] args) {

        Aquila Pino = new Aquila();
        Pino.dormi();
        Pino.mangia();
        Pino.verso();
        faiVolare(Pino);

        System.out.println("------------------------------");

        Cane Luna = new Cane();
        Luna.dormi();
        Luna.mangia();
        Luna.verso();

        System.out.println("------------------------------");

        Delfino Skipper = new Delfino();
        Skipper.dormi();
        Skipper.mangia();
        Skipper.verso();
        faiNuotare(Skipper);

        System.out.println("------------------------------");

        Passerotto Chip = new Passerotto();
        Chip.dormi();
        Chip.mangia();
        Chip.verso();
        faiVolare(Chip);
    }

}
