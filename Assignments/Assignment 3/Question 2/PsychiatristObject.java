public class PsychiatristObject {
    public void examine(MoodyObject moodyObject){
        System.out.println("How are you feeling today?");
        System.out.println(moodyObject.getMood());
        System.out.println();
        moodyObject.expressFeelings();
    }
    public void observe(MoodyObject moodyObject){
        System.out.print("Observation: "+moodyObject);
        System.out.println('\n');
    }
    public static void main(String args[]){
        MoodyObject happy=new HappyObject();
        MoodyObject sad=new SadObject();
        PsychiatristObject psychiatristObject=new PsychiatristObject();
        MoodyObject moodyObject[]=new MoodyObject[2];
        moodyObject[0]=happy;
        moodyObject[1]=sad;
        for(MoodyObject m:moodyObject){
            psychiatristObject.examine(m);
            psychiatristObject.observe(m);
        }
    }
}
