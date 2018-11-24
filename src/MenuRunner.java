public class MenuRunner {
    public static void main(String[] args){
        sandwich reuben = new sandwich(5.75,"Reuben");
        sandwich bec = new sandwich(2.00, "BEC");
        salad waldorf = new salad(7.25, "Waldorf");
        salad caeser = new salad(4.50,"Caeser");
        drink icedTea = new drink(1.50,"Iced Tea");
        drink smoothie = new drink(5.50, "Smoothie");

        Trio trio1 = new Trio(reuben, waldorf, icedTea);
        Trio trio2 = new Trio(bec, caeser, smoothie);
        Trio trio3 = new Trio(bec, caeser, icedTea);

        System.out.println(trio1.getName() + " Price: " + trio1.getPrice());
        System.out.println(trio2.getName() + " Price: " + trio1.getPrice());
        System.out.println(trio3.getName() + " Price: " + trio1.getPrice());
    }
}
