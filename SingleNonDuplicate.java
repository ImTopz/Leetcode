import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 根据题目很明显是二分查找算法
 * 或者是使用循环一次（利用set）
 */


class SolutionSingle {
    public int singleNonDuplicate(int[] nums) {
        Set test = new HashSet();
        for(int i=0;i<nums.length;i++) {
            if(test.add(nums[i])==false)
            {

                test.remove(nums[i]);
            }
            else
                test.add(nums[i]);
        }

        Object flag = test.toArray()[0];
        return  (Integer)flag;
    }
    public static void main(String[] args)
    {
        SolutionSingle solutionSingle = new SolutionSingle();
        int []test = {1,1,2,2,3,3,4,5,5};
        solutionSingle.singleNonDuplicate(test);
    }

}