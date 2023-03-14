public class HotDog extends FastFood {
    private String souse;

    public HotDog(String className, String filling, String souse) {
        super(className, filling);
        this.souse = souse;
    }

    public String getSouse() {
        return souse;
    }

    public String print() {
        return "Name: " + getClassName() + "\nFilling: " + getFilling() + "\nSouse: " + getSouse();
    }
}


