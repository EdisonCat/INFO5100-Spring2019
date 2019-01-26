public class ExtraCredit3 {
    public String reverse(String s){
        String result="";
        /* Method 1. Trim the leading and trailing spaces first

        int i=0;
        System.out.println(s.length());

        for(i=0;i<s.length();i++) {
            if(s.charAt(i)!=' '){
                break;
            }
        }
        s=s.substring(i);
        for(i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                break;
            }
        }
        s=s.substring(0,i+1);
        ...

        //Then cut the words by the spaces in between using for-loop...
        */

        //Method 2. Directly compute every index of the input
        boolean flagFirstSpace=false;
        boolean flagSecondSpace=false;
        int j,k;
        for(j=s.length()-1,k=s.length()-1;j>=0;j--){
            if(flagFirstSpace&&s.charAt(j)!=' '){
                flagSecondSpace=true;
            }
            else if(!flagSecondSpace&&s.charAt(j)==' '){
                flagFirstSpace=true;
                k=j;
            }
            else if(flagFirstSpace&&flagSecondSpace&&s.charAt(j)==' '){
                flagFirstSpace=false;
                flagSecondSpace=false;
                result+=s.substring(j,k);
                j++;
                k=j;
            }
        }
        result=result.substring(1,result.length());
        System.out.println(result);
        return result;
    }
    public static void main(String args[]){
        ExtraCredit3 extraCredit3=new ExtraCredit3();
        extraCredit3.reverse("  the                sky  is     blue  ");
    }
}
