package ZadaniaWzorceProjektowe_10_09.Zadanie2;

public class ChangedWheelsCar extends CarDecorator {

    WheelsDimensions wheelsDimensions;

    public ChangedWheelsCar(Car car, WheelsDimensions wheelsDimensions) {
        super(car);
        this.wheelsDimensions = wheelsDimensions;
    }

    @Override
    public void assembleCar() {
        super.assembleCar();
        System.out.println("You're car has " + wheelsDimensions.getNumVal() + " inch wheels.");
    }

}
