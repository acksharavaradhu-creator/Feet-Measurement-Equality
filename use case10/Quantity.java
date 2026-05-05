public Quantity<U> subtract(Quantity<U> other) {

    if (other == null) {
        throw new IllegalArgumentException("Other cannot be null");
    }

    if (this.unit.getClass() != other.unit.getClass()) {
        throw new IllegalArgumentException("Different measurement types");
    }

    double base1 = unit.convertToBaseUnit(value);
    double base2 = other.unit.convertToBaseUnit(other.value);

    double resultBase = base1 - base2;

    double result = unit.convertFromBaseUnit(resultBase);

    return new Quantity<>(round(result), unit);
}