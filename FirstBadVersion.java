/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int min = n;
        int l = 0;
        int h = n;
        while(l<=h)
        {
            int m = l+(h-l)/2;
            if(isBadVersion(m))
            {
                h = m -1 ;
                if(m<min)
                {
                    min = m;
                }

            }
            else
            {
                l = m + 1;
            }
        }

        return min;
    }
}