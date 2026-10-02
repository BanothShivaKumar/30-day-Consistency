public class rain
{
    public static void main(String[] args) {
        int a[]={4,2,0,6,3,2,5};
        int n=a.length;
        int left[]=new int[n];
        left[0]=a[0];
        int right[]=new int[n];
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],a[i]);
        }
        right[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],a[i]);
        }
        int waterlevel=0;
        int trappedwater=0;
        for(int i=0;i<n;i++)
        {
            waterlevel=Math.min(left[i],right[i]);
            trappedwater+=waterlevel-a[i]*1;
        }
        System.out.print(trappedwater);
        
    }
}