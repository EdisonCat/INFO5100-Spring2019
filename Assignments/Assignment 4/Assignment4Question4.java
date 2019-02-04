public class Assignment4Question4 {
    private String str="babad";
    private String longestString="";
    public String palindromicString(){
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++) {
                if (isPalindromicString(str.substring(i, j+1))) {
                    if(longestString.length()<str.substring(i,j+1).length()){
                        longestString=str.substring(i,j+1);
                    }
                }
            }
        }
        System.out.println(longestString);
        return longestString;
    }
    public boolean isPalindromicString(String string) {
        int i;
        int j = string.length() - 1;
        //strings contain only 1 character or less is not considered as a palindromic string
        if (string.length()<=1) {
            return false;
        }
        else {
            for (i = 0; i < string.length(); i++) {
                for (; j >= 0; j--) {
                    if (string.charAt(i) != string.charAt(j)) {
                        return false;
                    }
                    j--;//if break, j-- is needed
                    break;
                }
            }
            return true;
        }
    }

    public static void main(String args[]){
        Assignment4Question4 assignment4Question4=new Assignment4Question4();
        assignment4Question4.palindromicString();
    }
}
