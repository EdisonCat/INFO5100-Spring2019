import java.text.SimpleDateFormat;
import java.util.Date;

public class Dog extends Pet implements Boardable {
    private String size;
    public String dateStart,dateEnd;
    public Dog(String petName, String ownerName, String color, String size) {
        super(petName, ownerName, color);
        this.size=size;
    }
    public String getSize(){
        return this.size;
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

    @Override
    public String toString() {
        System.out.println("DOG");
        return super.toString();
    }
}
