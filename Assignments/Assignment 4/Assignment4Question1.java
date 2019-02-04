public class Assignment4Question1 {
    private boolean repeat=false;
    public int firstNonRepeatingCharacter(){
        String str="aocoo";
        for(int i=0;i<str.length();i++) {
            for (int j = 0; j < str.length(); j++) {
                if(i!=j) {
                    if (str.charAt(i) != str.charAt(j)) {
                        repeat = false;
                    } else {
                        repeat = true;
                        break;
                    }
                }
            }
            if(!repeat){
                System.out.println(i);
                return i;
            }
        }
        System.out.println(-1);
        return -1;
    }
    public static void main(String args []){
        Assignment4Question1 assignment4Question1=new Assignment4Question1();
        assignment4Question1.firstNonRepeatingCharacter();
    }
}
