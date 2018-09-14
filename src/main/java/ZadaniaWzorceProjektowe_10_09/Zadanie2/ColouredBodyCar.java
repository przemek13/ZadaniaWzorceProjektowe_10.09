package ZadaniaWzorceProjektowe_10_09.Zadanie2;

public class ColouredBodyCar extends CarDecorator {
    Colours bodyColour;

    public ColouredBodyCar(Car car, Colours bodyColour) {
        super(car);
        this.bodyColour = bodyColour;
    }

    @Override
    public void assembleCar() {
        super.assembleCar();
        System.out.println("You're car has " + bodyColour.getColour() + " colour.");
    }
}
