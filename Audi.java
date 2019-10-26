public class Audi extends Car {

    public Audi(Color color, int capacity, Man driver) {
        super("Audi", color, GearBox.AUTOMATIC, capacity, driver);
    }

    @Override
    public void switchSpeed() {
        System.out.println("Speed is switched automatically");
    }
}
