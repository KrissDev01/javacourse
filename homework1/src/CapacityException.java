public class CapacityException extends Exception {
    int id;

    public CapacityException(int x) {
        id = x;
    }

    @Override
    public String toString() {
        return "Car capacity exception[" + id + "]";
    }

}
