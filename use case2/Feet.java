public class Feet {

    public boolean isEqual(double value1, double value2) {

        if (Double.isNaN(value1) || Double.isNaN(value2)) {
            return false;
        }

        return value1 == value2;
    }
}