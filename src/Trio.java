public class Trio implements MenuItem{
    private sandwich sandwich;
    private salad salad;
    private drink drink;

    public Trio(sandwich sandwich, salad salad, drink drink){
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    public String getName(){
        return this.sandwich.getName() + "/" + this.salad.getName() + "/" + this.drink.getName();
    }

    public double getPrice(){
        double a = sandwich.getPrice();
        double b = salad.getPrice();
        double c = drink.getPrice();

        if (a > c && b > c){
            return a + b;
        }
        if (a > b && c > b){
            return a + c;
        }
        if (b>a && c>a ){
            return b+c;
        }
    }
}
