import java.util.ArrayList;


public class Mreview extends java.lang.Object implements java.lang.Comparable<Mreview>{
    private String title;
    private ArrayList<Integer> ratings;

    Mreview(){
        this.title="";
        this.ratings=new ArrayList<>();
    }
    Mreview(String ttl){
        this();
        this.title=ttl;
    }
    Mreview(String ttl, int firstRating){
        this(ttl);
        this.ratings.add(firstRating);
    }

    public void addRating(int r){
        this.ratings.add(r);
    }
    public double aveRating(){
        int ratingSum=0;
        for(int i=0;i<this.ratings.size();i++){
            ratingSum+=this.ratings.get(i);
        }
        return (double)Math.round((double)ratingSum/this.ratings.size()*100)/100;
    }
    public String getTitle(){
        return this.title;
    }
    public int numRatings(){
        return this.ratings.size();
    }

    @Override
    public int compareTo(Mreview o) {
        if(this.aveRating()>o.aveRating()){
            return 1;
        }
        else if(this.aveRating()<o.aveRating()){
            return -1;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Title: "+this.getTitle()+"\nAverage Rating: "+this.aveRating()+
                "\nNumber of Ratings: "+this.numRatings();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    public static void main(String args []){
        Mreview mreview=new Mreview("Kill Bill",4);//one object one rating
        mreview.addRating(4);//second rating
        mreview.addRating(3);//third rating
        System.out.println(mreview);

        Mreview mreview1=new Mreview("Titanic",4);
        System.out.println(mreview.compareTo(mreview1));
        System.out.println(mreview.equals(mreview1));
    }
}
