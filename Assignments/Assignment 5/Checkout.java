import java.util.Vector;

public class Checkout extends java.lang.Object{
    int cost=0;
    Vector<DessertItem> vector=new Vector<>();
    Checkout(){

    }

    public int numberOfItems(){
        return  this.vector.size();
    }

    public void enterItem(DessertItem item){
        vector.add(item);
    }

    public void clear(){
        vector.clear();
    }

    public int totalCost(){
        this.cost=0;
        for(int i=0;i<vector.size();i++){
            cost+=vector.elementAt(i).getCost();
        }
        return cost;
    }

    public int totalTax(){
        double temp=cost * DessertShoppe.taxRate;
        return (int)Math.round(temp);
    }

    public String toString() {
        System.out.println("    "+DessertShoppe.nameOfStore);
        System.out.println("----------------------------\n");
        for(int i=0;i<vector.size();i++){
            if(vector.elementAt(i).getClass()==Candy.class){
                System.out.printf("%.2f",vector.elementAt(i).weight);
                System.out.println(" lbs. @ "+DessertShoppe.cent2dollarsAndCentsmethod(vector.elementAt(i).pricePerPound)+" /lb.");
            }
            else if(vector.elementAt(i).getClass()==Cookie.class){
                System.out.println(vector.elementAt(i).number+" @ "+DessertShoppe.cent2dollarsAndCentsmethod(vector.elementAt(i).pricePerDozen)+" /dz.");
            }
            if(vector.elementAt(i).getClass()==Sundae.class){
                int a=24+vector.elementAt(i).getName().indexOf("\n");
                a=-a;
                String b="%"+a+"s%-21s";
                System.out.println(String.format(b,vector.elementAt(i).getName(),DessertShoppe.cent2dollarsAndCentsmethod(vector.elementAt(i).getCost())));
            }
            else
                System.out.println(String.format("%-23s%-21s",vector.elementAt(i).getName(),DessertShoppe.cent2dollarsAndCentsmethod(vector.elementAt(i).getCost())));
        }
        if(this.totalTax()<100){
            System.out.println(String.format("%-24s%-21s","Tax",DessertShoppe.cent2dollarsAndCentsmethod(this.totalTax()).substring(1)));
        }
        else
            System.out.println(String.format("%-23s%-21s","Tax", DessertShoppe.cent2dollarsAndCentsmethod(this.totalTax())));
        System.out.println(String.format("%-22s%-21s","Total Cost",DessertShoppe.cent2dollarsAndCentsmethod(this.totalTax()+this.totalCost())));
        return "";
    }
}
