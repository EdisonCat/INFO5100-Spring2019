public class HappyObject extends MoodyObject{
    protected String getMood(){
        return "I feel happy today";
    }
    public void expressFeelings(){
        System.out.println("HA");
    }
    public String toString(){
        return "subject laughs a lot";
    }
}