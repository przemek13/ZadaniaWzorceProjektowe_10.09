package ZadaniaWzorceProjektowe_10_09.Zadanie2;

public enum Colours {
    WHITE("white"), BLACK("black"), RED("red"), GREEN("green"), BLUE("blue");

    private String colour;

    Colours (String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
