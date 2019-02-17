public abstract class DessertItem {
    protected String name;
    protected double weight;
    protected int pricePerPound;
    protected int number;
    protected int pricePerDozen;
    protected abstract int getCost();
    public DessertItem(){
    }
    public DessertItem(String name){
        this.name=name;
    }
    public final String getName(){
        return this.name;
    }
}