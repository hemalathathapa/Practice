import java.util.*;
class Numbers{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Numbers nw=new Numbers();
        nw.isWhatTypeOfInteger(n);
    
    }

    
        void isWhatTypeOfInteger(int n)
        {
        if(n>0)
        {
            System.out.println("Positive");
        }
        if(n<0)
        {
            System.out.println("Negative");
        }
        if(n==0)
        {
            System.out.println("Zero");
        }
        
    }
}
    
