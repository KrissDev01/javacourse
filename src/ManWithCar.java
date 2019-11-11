public class ManWithCar extends Man {
    private Car personalCar;

    public ManWithCar(Man man, Car personalCar) {
        super(man.getName(), man.getAge());
        this.personalCar = personalCar;
    }

    public Car getPersonalCar() {
        return personalCar;
    }

    public void setPersonalCar(Car personalCar) {
        this.personalCar = personalCar;
    }
}
