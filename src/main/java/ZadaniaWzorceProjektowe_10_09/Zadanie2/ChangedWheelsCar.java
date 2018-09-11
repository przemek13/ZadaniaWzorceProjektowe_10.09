package ZadaniaWzorceProjektowe_10_09.Zadanie2;

public class ChangedWheelsCar extends CarDecorator {

    int wheelsDimensions;

    public ChangedWheelsCar(Car car, int wheelsDimensions) {
        super(car);
        this.wheelsDimensions = wheelsDimensions;
    }

    @Override
    public void assembleCar() {
        super.assembleCar();
        System.out.println("You're car has " + wheelsDimensions + " inch wheels.");
    }

}
