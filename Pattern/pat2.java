//hollow rectangle
//*****
//*   *
//*   *
//*****
public class pat2 
{
    public static void main(String args[]) 
    {
        int i,j;
        for(i=1;i<5;i++)
        {
            if(i==1 || i==4)
            {
                for(j=1;j<=5;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(j=1;j<=5;j++)
                {
                    if(j==1 || j==5)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                    
                }
            }
            System.out.println();
        }
    }
}