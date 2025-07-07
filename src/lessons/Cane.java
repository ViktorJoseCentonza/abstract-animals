package lessons;

public class Cane extends AbstractAnimale {

    @Override
    public void verso() {
        System.out.println("Bau!");
    }

    @Override
    public void mangia() {
        System.out.println("cibo per cani");
    }
}
