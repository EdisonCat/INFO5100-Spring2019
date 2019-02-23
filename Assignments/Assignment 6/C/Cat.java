import java.text.SimpleDateFormat;
import java.util.Date;

public class Cat extends Pet implements Boardable{
    private String hairLength;
    String dateStart,dateEnd;
    public Cat(String petName, String ownerName, String color, String hairLength){
        super(petName,ownerName,color);
        this.hairLength=hairLength;
    }

    public String getHairLength(){
        return hairLength;
    }

    @Override
    public String toString() {
        System.out.println("CAT");
        return super.toString()+"\nHair: "+this.getHairLength();
    }

    @Override
    public void setBoardStart(int month, int day, int year) {
        if(month>0&&month<12&&day>0&&day<31&&year>=1000&&year<=9999) {
            this.dateStart=month+"-"+day+"-"+year;
        }
        else
            System.out.println("dateStart error");
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
        if(month>0&&month<12&&day>0&&day<31&&year>=1000&&year<=9999) {
            this.dateEnd=month+"-"+day+"-"+year;
        }
        else
            System.out.println("dateEnd error");
    }

    @Override
    public boolean boarding(int month, int day, int year) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MM-dd-yyyy");
        if(dateEnd!=null&&dateStart!=null&&month>0&&month<12&&day>0&&day<31&&year>=1000&&year<=9999) {
            try {
                String dateEnter = month + "-" + day + "-" + year;
                Date tempDateStart = simpleDateFormat.parse(dateStart);
                Date tempDateEnd = simpleDateFormat.parse(dateEnd);
                Date tempDateEnter = simpleDateFormat.parse(dateEnter);
                if (tempDateEnter.before(tempDateEnd) && tempDateEnter.after(tempDateStart)) {
                    return true;
                }
                else if (tempDateEnter.equals(tempDateEnd) || tempDateEnter.equals(tempDateStart))
                    return true;
                else
                    return false;
            } catch (Exception e) {
                System.out.println("dateEnter error");
            }
            return false;
        }
        else
            System.out.println("dateStart or dateEnd error");
        return false;
    }
}
