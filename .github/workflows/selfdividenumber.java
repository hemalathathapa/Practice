class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ls=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(isSelfDivide(i))
            {
                ls.add(i);
            }
        }
        return ls;
    }
    public static boolean isSelfDivide(int n)
    {
        int temp=n;
        while(n>0)
        {
            int r=n%10;
            if(r==0||temp%r!=0)
            {
                return false;
            }
            n=n/10;
        }
        return true;
    }
}
