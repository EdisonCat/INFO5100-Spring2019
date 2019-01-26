public class SadObject extends MoodyObject{
    protected String getMood(){
        return "I feel sad today";
    }
    public void expressFeelings(){
        System.out.println("WAH");
    }
    public String toString(){
        return "subject cries a lot";
    }
}