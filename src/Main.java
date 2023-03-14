public class Main {
    public static void main(String[] args) {
        CreateObject("Hamburger");
        System.out.println("-----------------------------");
        CreateObject("Pizza");
        System.out.println("-----------------------------");
        CreateObject("HotDog");


    }

    public static String CreateObject(String className) {
        switch (className) {
            case "Hamburger":
                Hamburger hamburger = new Hamburger("Hamburger", "Cutlet", "Onion");
                System.out.println(hamburger.print());
                break;
            case "Pizza":
                Pizza pizza = new Pizza("Pizza", "Bacon", 28);
                System.out.println(pizza.print());
                break;
            case "HotDog":
                HotDog hotDog = new HotDog("HotDog", "Sausage", "Mustard");
                System.out.println(hotDog.print());
                break;

        }
        return className;

    }


}
