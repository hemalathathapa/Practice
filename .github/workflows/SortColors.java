import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sortColors(arr);
        for(int h:arr)
        {
            System.out.print(h+" ");
        }
    }
    public static void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}
