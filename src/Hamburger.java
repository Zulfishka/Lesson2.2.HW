public class Hamburger extends FastFood {

    private String vegetables;

    public Hamburger(String className, String filling, String vegetables) {
        super(className, filling);
        this.vegetables = vegetables;
    }

    public String getVegetables() {
        return vegetables;
    }

    public String print2() {
        return "Name: " + getClassName() + "\nFilling: " + getFilling() + "\nVegetables: " + getVegetables();
    }

    public String print() {
        return "Name: " + getClassName() + "\nFilling: " + getFilling() + "\nVegetables: " + getVegetables();
    }


}




