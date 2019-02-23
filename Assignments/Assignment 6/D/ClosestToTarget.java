public class ClosestToTarget {
    public int closestToTarget (int target, int [] A){
        int left=0;
        int right=A.length-1;
        if(A==null||A.length==0) {//parameter passed will not be null
            System.out.println("Array is empty");
            throw new NullPointerException();
        }
        else {
            for (int i = (right + left) / 2; right - left > 1; i = (right + left) / 2) {
                if (A[i] > target) {
                    right = i;
                } else if (A[i] < target) {
                    left = i;
                } else
                    return i;
            }
            //Time complexity O(log2N)
            if (Math.abs(target - A[left]) > Math.abs(target - A[right])) {
                return right;
            } else
                return left;
        }
    }
    public static void main(String args[]){
        try {
            int [] A={1,2,3,3,3,3,3,5};
            ClosestToTarget closestToTarget=new ClosestToTarget();
            int [] B=null;//null
            int [] C={};//empty array
            System.out.println(closestToTarget.closestToTarget(3,A));//equal
            System.out.println(closestToTarget.closestToTarget(2,A));//less than median
            System.out.println(closestToTarget.closestToTarget(4,A));//larger than median
            System.out.println(closestToTarget.closestToTarget(-1,A));//less than minimum
            System.out.println(closestToTarget.closestToTarget(10,A));//larger than maximum
            System.out.println(closestToTarget.closestToTarget(1, C));//empty array
            System.out.println(closestToTarget.closestToTarget(1, B));
        }
        catch (NullPointerException e){
            System.out.println("Array is null");
        }
    }
}
