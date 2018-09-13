package ZadaniaWzorceProjektowe_10_09.Zadanie2;

public abstract class CarDecorator implements Car {

    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assembleCar() {
        car.assembleCar();
    }
}
