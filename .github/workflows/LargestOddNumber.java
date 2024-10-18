import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String t=largestOddNumber(str);
        System.out.print(t);
    }
    public static String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--)
        {
            if(num.charAt(i)%2!=0)
            {
                return num.substring(0,i+1);
            }
        }
        return "";
}
}
