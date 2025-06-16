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

        Passerotto chip = new Passerotto("chip", "semini", "chirp!");

        faiVolare(chip);

        Cane Luna = new Cane("luna", "bau", "cibo per cani");
        Luna.mangia();

        Delfino skipper = new Delfino("Skipper", "squeek", "pesci");

        faiNuotare(skipper);
    }

}
