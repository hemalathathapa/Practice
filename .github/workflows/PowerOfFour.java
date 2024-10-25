class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0)
        {
            return false;
        }
        int temp=n,count=0;
        while(n>0)
        {
            if(n%4==0)
            {
                count++;
            }
            else
            {
                break;
            }
            n=n/4;
        }
        return temp==Math.pow(4,count);
    }
}
    
