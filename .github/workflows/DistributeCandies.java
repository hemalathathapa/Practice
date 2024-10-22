class Solution {
    public int distributeCandies(int[] candyType) {
        int count=1;
        Arrays.sort(candyType);
        for(int i=0;i<candyType.length-1;i++)
        {
            if(candyType[i]!=candyType[i+1])
            {
                count++;
            }
        }
        if(count>=candyType.length/2){
            return candyType.length/2;
        }
        else if(count<candyType.length/2)
        {
            return count;
        }
        return 1;
    }
}
