public class Pet {
    private String petName;
    private String ownerName;
    private String color;
    protected int sex;
    public static final int MALE=0;
    public static final int FEMALE=1;
    public static final int SPAYED=2;
    public static final int NEUTERED=3;

    public Pet(String petName, String ownerName, String color){
        this.petName=petName;
        this.ownerName=ownerName;
        this.color=color;
    }

    public String getPetName() {
        return petName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setSex(int sexid){
        if(sexid>=0&&sexid<=3)
            this.sex=sexid;
    }

    public String getSex() {
        switch (this.sex){
            case 0:return "Male";
            case 1:return "Female";
            case 2:return "Spayed";
            case 3:return "Neutered";
            default:return "";
        }
    }

    @Override
    public String toString() {
        return  getPetName()+" owned by "+getOwnerName()+
                "\nColor: "+getColor()+
                "\nSex: "+getSex();
    }

    public static void main(String args []){
        Cat cat=new Cat("Bepa","Edison","white","long");
        cat.setSex(FEMALE);
        cat.setBoardStart(01,1,1999);
        cat.setBoardEnd(01,1,2005);
        System.out.println(cat);
        System.out.println("During boarding time: "+cat.boarding(1,1,1999));
        System.out.println();
        Dog dog=new Dog("Bobby","Edison","black","medium");
        dog.setSex(MALE);
        dog.setBoardStart(02,1,1999);
        dog.setBoardEnd(02,1,2005);
        System.out.println(dog);
        System.out.println("During boarding time: "+dog.boarding(1,1,1999));
    }
}