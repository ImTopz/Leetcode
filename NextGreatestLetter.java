/**
 * 首先。如果有的话 直接返回他的下一个字符
 * 如果没有 则需要进行一个查找 设置一个min
 * 如果越界 则考虑极限
 * 考虑特殊情况 但是因为 有序 所以只需要考虑左边都是一样的需要取右边的情况
 * 如果target等于末尾元素 则返回第一个元素
 */
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int len = letters.length;
        int high = len-1;
        int mid = 0;
        char min_flag='z';
        while(low<=high)
        {
            mid = (low+high) / 2;
            if(letters[mid] == target && mid != len-1)
                if(letters[mid+1]!=letters[mid])
                    return letters[mid+1];
            if(target == letters[len-1])
                return letters[0];
            else if(letters[mid]<=target) {
                if (letters[mid] < min_flag && letters[mid] > target)
                    min_flag = letters[mid];
                low = mid + 1;
            }
            else {
                if (letters[mid] < min_flag && letters[mid] > target)
                    min_flag = letters[mid];
                high = mid - 1;
            }
        }
        if(min_flag == 'z')
            return letters[0];
        return min_flag;
    }



}


public class NextGreatestLetter {
    public static  void main(String[] args)
    {
        Solution solution = new Solution();
        char []test = {'e','e','e','e','e','e','n','n','n','n'};
        char result = solution.nextGreatestLetter(test,'e');
        System.out.println(result);
    }
}