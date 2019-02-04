import java.util.Arrays;

public class Assignment4Question5 {
    private int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
    public void rotateMatrix(){
        int [][] newMatrix=new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                newMatrix[j][matrix.length-1-i]=matrix[i][j];
            }
        }
        System.out.println(Arrays.deepToString(newMatrix));//print 2d array in one line
    }
    public static void main(String args[]){
        Assignment4Question5 assignment4Question5=new Assignment4Question5();
        assignment4Question5.rotateMatrix();
    }
}
