public class infosys
{
    public static void main(String[] args) {
        int a[]={2,0,2,1,1,0};
        int start=0;
        int end=a.length-1;
        for(int i=start;i<end;i++)
        {
            if(a[start]>a[end])
            {
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }
        }
        for(int num:a)
        {
            System.out.print(num+" ");
        }
    }
}