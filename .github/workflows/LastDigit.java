import java.util.*;
class LastDigit{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Numbers nw=new Numbers();
        int res=nw.returnLastDigit(n);
        System.out.println(res);
    
    }

    
        int  returnLastDigit(int n)
        {
        int r=n%10;
        return r;
        
    }
}
    
