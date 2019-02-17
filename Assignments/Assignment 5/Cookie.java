public class Cookie extends DessertItem {
    @Override
    protected int getCost() {

        return (int)Math.round((double)number/12 * pricePerDozen);
    }
    Cookie(String name, int number, int pricePerDozen){
        this.number=number;
        this.name=name;
        this.pricePerDozen=pricePerDozen;
    }
}
