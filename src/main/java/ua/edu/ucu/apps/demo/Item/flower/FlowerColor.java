package ua.edu.ucu.apps.demo.Item.flower;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    GREEN("##00FF00"), WHITE("#FFFFFF");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
