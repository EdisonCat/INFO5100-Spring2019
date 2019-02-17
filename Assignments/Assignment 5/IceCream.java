public class IceCream extends DessertItem {
    int cost;
    IceCream(String name, int cost){
        this.name=name;
        this.cost=cost;
    }
    @Override
    protected int getCost() {
        return cost;
    }
}
class Sundae extends IceCream{
    Sundae(String toppingName, int toppingCost, String iceCreamName, int iceCreamCost){
        super(iceCreamName,iceCreamCost);
        this.name+=" Sundae with\n"+toppingName;
        super.cost=toppingCost+iceCreamCost;
    }
}