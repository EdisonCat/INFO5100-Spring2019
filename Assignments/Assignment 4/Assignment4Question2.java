public class Assignment4Question2 {
    private int num=38;
    public int oneDigit(){
        int tempNum;
        int i;
        while(num>=10) {
            tempNum=num;
        for(i=0;tempNum>0;i++){
            tempNum=tempNum/10;
        }
            if (i > 1) {
                int[] temp = new int[i];
                for (int j = 0; j < i; j++) {
                    temp[j] = (int) Integer.toString(num).charAt(j) - 48;
                }
                num = 0;
                for (int j = 0; j < i; j++) {
                    num += temp[j];
                }
            }
        }
        System.out.println(num);
        return 0;
    }
    public static void main(String args[]){
        Assignment4Question2 assignment4Question2=new Assignment4Question2();
        assignment4Question2.oneDigit();
    }
}
