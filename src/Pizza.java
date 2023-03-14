public class Pizza extends FastFood {

    private int size;

    public Pizza(String className, String filling, int size) {
        super(className, filling);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String print() {
        return "Name: " + getClassName() + "\nFilling: " + getFilling() + "\nSize: " + getSize();
    }
}
