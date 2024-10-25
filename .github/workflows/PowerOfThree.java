class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0)
        {
            return false;
        }
        int temp=n,count=0;
        while(n>0)
        {
            if(n%3==0)
            {
                count++;
            }
            else
            {
                break;
            }
            n=n/3;
        }
        return temp==Math.pow(3,count);
    }
}
