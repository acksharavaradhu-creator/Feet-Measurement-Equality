public enum WeightUnit {

    KG(1.0),
    GRAM(0.001),
    POUND(0.453592);

    private double toKg;

    WeightUnit(double toKg) {
        this.toKg = toKg;
    }

    public double toBase(double value) {
        return value * toKg;
    }

    public double fromBase(double value) {
        return value / toKg;
    }
}