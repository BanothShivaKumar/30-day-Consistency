// // // public class M {
// // //     public static void main(String[] args) {
// // //         int a[]={1,2,3,4,5,90};
// // //         int largest=a[0];
// // //         for(int i=1;i<a.length;i++)
// // //         {
// // //             if(largest>a[i])
// // //             {
// // //                 largest=a[i];
// // //             }
// // //         }

// // //         System.out.println("largest:"+largest);
        
// // //     }
// // // }
// // // to find the greatest element in it 



// // // public class M {
// // //     public static void sbinarysearch(int a[],int key,int low,int high)
// // //     {
// // //         while(low<=high)
// // //         {
// // //             int mid=(low+high)/2;
// // //             if(a[mid]==key)
// // //             {
// // //                 System.out.println("The element found at the position"+mid);
// // //                 break;
// // //             }
// // //             else if(a[mid]>key)
// // //             {
// // //                 high=mid-1;
// // //             }
// // //             else
// // //             {
// // //                 low=mid+1;
// // //             }
// // //         }
// // //         System.out.print("The element is not found");
// // //     }
// // //     public static void main(String[] args) {
// // //         int a[]={1,2,3,4,5};
// // //         int key=5;
// // //         int low=0;
// // //         int high=a.length-1;
// // //         sbinarysearch(a,key,low,high);
// // //     }
// // // }


// // // public class M
// // // {
// // //     public static void main(String[] args) {
// // //         int a[]={1,2,3,4,5,6};
// // //         int start=0;
// // //         int end=a.length-1;
// // //         while(start<end)
// // //         {
// // //             int temp=a[end];
// // //             a[end]=a[start];
// // //             a[start]=temp;
// // //             start++;
// // //             end--;
// // //         }
// // //         for(int i=0;i<a.length;i++)
// // //         {
// // //             System.out.print(a[i]+" ");
// // //         }
// // //     }
// // // }

// // public class M {

// //     public static void main(String[] args) {

// //         int count = 0;
// //         int a[] = {2, 4, 6, 8, 10};
// //         int n = a.length;

// //         for (int i = 0; i < n; i++) {

// //             for (int j = i; j < n; j++) {

// //                 for (int k = i; k <= j; k++) {

// //                     System.out.print(a[k] + " ");
                
// //                 }
// //                 count++;
// //                 System.out.println();
// //             }
// //         }

// //         System.out.println("Count = " + count);
// //     }
// // }




// // public class M
// // {
// //     public static void main(String[] args) {
// //         int a[]={1,2,3,4,5,6};
// //         int n=a.length;
// //         int largest=a[0];
// //         int secondlargest=Integer.MIN_VALUE;
// //         for(int i=1;i<n;i++)
// //         {
// //             if(a[i]>largest)
// //             {
// //                 secondlargest=largest;
// //                 largest=a[i];
// //             }
// //             else if(secondlargest<a[i] && a[i]!=largest)
// //             {
// //                 secondlargest=a[i];
// //             }
// //         }
// //         System.out.println("The largest nuber is "+largest);
// //         System.out.println("The second largest nuber is "+secondlargest);
// //     }
// // }



// public class M
// {
//     public static void main(String[] args) {
//         int a[]={1,2,3,4,5,6};
//         int n=a.length;
//         for(int i=0;i<n;i++)
//         {
//             for(int j=i+1;j<n;j++)
//             {
//                 for(int k=i;k<j;k++)
//                 {
//                     System.out.print(a[k]+",");
//                 }
//                 System.out.println();
//             }
//             System.out.println("------");
//         }
//     }
// }


// import java.lang.*;
// public class M
// {
//     public static void main(String[] args) {
//         int a[]={1,-2,6,-1,3};
//         int currsum=0;
//         int maxsum=Integer.MIN_VALUE;
//         int n=a.length;
//         int[] prefix=new int[n];
//         prefix[0]=a[0];
//         for(int i=1;i<prefix.length;i++)
//         {
//             prefix[i]=prefix[i-1]+a[i];
//         }
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 currsum= i==0 ? prefix[j]:prefix[j]-prefix[i-1];
//                 System.out.println(currsum);
//                 if(maxsum<currsum)
//                 {
//                     maxsum=currsum;
//                 }


//             }
//         }
//         System.out.println("The maximum sum is:");
//         System.out.print(maxsum);
//     }
// }

public class M
{
    public static void main(String[] args) {
        int a[]={4,2,0,6,3,2,5};
        int n=a.length;
        int left[]=new int[n];
        left[0]=a[0];
        int right[]=new int[n];
        for(int i=1;i<n-1;i++)
        {
            left[i]=Math.max(left[i-1],a[i]);
        }
        right[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],a[i]);
        }
        int trappedwater=0;
        for(int i=0;i<n;i++)
        {
            trappedwater+=Math.min(left[i],right[i]);
        }
        System.out.print("The trapped water is"+trappedwater);
        
    }
}