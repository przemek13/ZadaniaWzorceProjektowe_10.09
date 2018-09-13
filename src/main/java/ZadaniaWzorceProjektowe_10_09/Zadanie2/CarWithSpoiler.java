package ZadaniaWzorceProjektowe_10_09.Zadanie2;

public class CarWithSpoiler extends CarDecorator {

    public CarWithSpoiler(Car car) {
        super(car);
    }

    @Override
    public void assembleCar() {
        super.assembleCar();
        System.out.println("You're car has a spoiler.");
    }
}
