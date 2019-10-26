import java.util.Objects;

public class Car extends Machine implements Acceleration {
    private String model;
    private Color color;
    private GearBox gearBox;
    private int capacity;
    private Man driver;
    private int numberOfPassengers = 0;

    public Car() {}

    public Car(String model, Color color, GearBox gearBox, int capacity, Man driver) {
        this.model = model;
        this.color = color;
        this.gearBox = gearBox;
        this.capacity = capacity;
        this.driver = driver;
    }


    protected void switchSpeed(int speed) {
        if (gearBox == GearBox.AUTOMATIC) {
            System.out.println("You have automatic gearbox!");
        } else if (speed > 0 && speed <= 6)
            System.out.println("Speed is switched to  " + speed);
        else
            System.out.println("The speed can be only from 1 to 6!");
    }


    protected void switchSpeed() {
        if (gearBox == GearBox.MANUAL) {
            System.out.println("You have manual gearbox!");
        } else
            System.out.println("The gear switched automatically.");

    }

    public void accelerate() {
        System.out.println("Car is accelerated");
    }

    protected void loadPassengers(int numberOfPassengers) throws CapacityException {
        int temp = this.numberOfPassengers + numberOfPassengers;
        if (temp > capacity - 1) {
            this.numberOfPassengers = capacity - 1;
            throw new CapacityException(temp);
        } else
            this.numberOfPassengers = temp;
            System.out.println("Number of passengers in the car: " + this.numberOfPassengers);
    }

    protected void unloadPassengers(int numberOfPassengers) {
        if (this.numberOfPassengers == 0) {
            System.out.println("There were no passengers in the car!");
        } else {
            int temp = this.numberOfPassengers - numberOfPassengers;
            this.numberOfPassengers = temp < 0 ? 0 : temp;
            System.out.println("Number of passengers in the car: " + this.numberOfPassengers);
        }
    }

    protected Color getColor() {
        return color;
    }

    protected void setColor(Color color) {
        this.color = color;
    }

    protected String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    protected GearBox getGearBox() {
        return gearBox;
    }

    protected void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }

    protected int getCapacity() {
        return capacity;
    }

    protected void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    protected Man getDriver() {
        return driver;
    }

    protected void setDriver(Man driver) {
        this.driver = driver;
    }


    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Car{model=");
        stringBuilder.append(model);
        stringBuilder.append(", color=");
        stringBuilder.append(color);
        stringBuilder.append(", gearbox=");
        stringBuilder.append(gearBox);
        stringBuilder.append(", capacity=");
        stringBuilder.append(capacity);
        stringBuilder.append(", current driver is ");
        stringBuilder.append(driver.toString());
        if (numberOfPassengers == 0)
            stringBuilder.append(", no passengers loaded.");
        else {
            stringBuilder.append(", currently loaded ");
            stringBuilder.append(numberOfPassengers);
            stringBuilder.append(" passengers.");
        }

        stringBuilder.append('}');

        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getCapacity() == car.getCapacity() &&
                getModel().equals(car.getModel()) &&
                getColor() == car.getColor() &&
                getGearBox() == car.getGearBox();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getColor(), getGearBox(), getCapacity());
    }
}
