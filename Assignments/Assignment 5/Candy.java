public class Candy extends DessertItem {
    @Override
    protected int getCost() {
        double cost=weight*pricePerPound;
        return (int)Math.round(cost);
    }
    Candy(String name, double weight, int pricePerPound){
        super(name);
        this.pricePerPound=pricePerPound;
        this.weight=weight;
    }
}
