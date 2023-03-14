public abstract class FastFood implements Printable {
    private String className;
    private String filling;


    public FastFood(String className, String filling) {
        this.className = className;
        this.filling = filling;
    }

    public String getClassName() {
        return className;
    }

    public String getFilling() {
        return filling;
    }

    @Override
    public String print() {
        return null;
    }


}