import java.util.Arrays;

public class Assignment4Question3 {
    private int [] arrayNum={0,1,0,3,12};
    public int [] moveZero(){
        for(int i=0;i<arrayNum.length;i++){
            for(int j=0;j<arrayNum.length-1;j++) {
                if (arrayNum[j] == 0) {
                    int temp = arrayNum[j];
                    arrayNum[j] = arrayNum[j + 1];
                    arrayNum[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrayNum));//print 1d array in one line
        return arrayNum;
    }
    public static void main(String args[]){
        Assignment4Question3 assignment4Question3=new Assignment4Question3();
        assignment4Question3.moveZero();
    }
}
