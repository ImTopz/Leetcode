public class Xsqrt {
    public int mySqrt(int x) {
        if(x==0)
        {
            return 0;
        }
        if(x==1 || x==2 || x==3)
        {
            return 1;
        }

        int left  =  2;
        int right =  x/2;
        int max = 0;

        while(left <= right ){
            int tmp = ( left + right) / 2;
            if((long)tmp*tmp <= x)
            {
                if(tmp >= max)
                {
                    max = tmp;
                }
                left = tmp + 1;
            }
            else
            {
                right = tmp - 1;
            }
        }
        return max;

    }
    public static void main(String [] args)
    {
        Xsqrt xsqrt = new Xsqrt();
        System.out.println(xsqrt.mySqrt(21
        ));
    }
}
/**
 * 二分查找的实现
 * 这里没有用数组存储，是因为这组数字之间也是连续的
 * 要注意边界的处理情况
 */
