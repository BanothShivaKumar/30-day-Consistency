// public class M {
//     public static void main(String[] args) {
//         int a[]={1,2,3,4,5,90};
//         int largest=a[0];
//         for(int i=1;i<a.length;i++)
//         {
//             if(largest>a[i])
//             {
//                 largest=a[i];
//             }
//         }

//         System.out.println("largest:"+largest);
        
//     }
// }
// to find the greatest element in it 



// public class M {
//     public static void sbinarysearch(int a[],int key,int low,int high)
//     {
//         while(low<=high)
//         {
//             int mid=(low+high)/2;
//             if(a[mid]==key)
//             {
//                 System.out.println("The element found at the position"+mid);
//                 break;
//             }
//             else if(a[mid]>key)
//             {
//                 high=mid-1;
//             }
//             else
//             {
//                 low=mid+1;
//             }
//         }
//         System.out.print("The element is not found");
//     }
//     public static void main(String[] args) {
//         int a[]={1,2,3,4,5};
//         int key=5;
//         int low=0;
//         int high=a.length-1;
//         sbinarysearch(a,key,low,high);
//     }
// }


// public class M
// {
//     public static void main(String[] args) {
//         int a[]={1,2,3,4,5,6};
//         int start=0;
//         int end=a.length-1;
//         while(start<end)
//         {
//             int temp=a[end];
//             a[end]=a[start];
//             a[start]=temp;
//             start++;
//             end--;
//         }
//         for(int i=0;i<a.length;i++)
//         {
//             System.out.print(a[i]+" ");
//         }
//     }
// }

public class M 
{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("("+a[i] + " ,"+ a[j]+")  ");
            }
            System.out.println();
        }
    }
}