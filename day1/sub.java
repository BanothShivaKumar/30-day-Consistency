import java.lang.*;
public class sub
{
    public static void main(String[] args) {
        int a[]={1,-2,6,-1,3};
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int n=a.length-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                currsum=0;
                for(int k=i;k<=j;k++)
                {
                    currsum=currsum+a[k];
                }
                if(currsum<maxsum)
                {
                    maxsum=currsum;
                }

            }
        }
        System.out.println("The maximum sum is:");
        System.out.print(maxsum);
    }
}