public class Dodge extends Car {

    public Dodge(Color color, int capacity, Man driver) {
        super("Dodge", color, GearBox.MANUAL, capacity, driver);
    }

    @Override
    public void switchSpeed(int speed) {
        if (speed > 0 && speed <= 5)
            System.out.println("Speed is switched to  " + speed);
        else
            System.out.println("The speed in Dodge can be only from 1 to 5!");

    }
}
