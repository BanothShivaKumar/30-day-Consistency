// import java.util.*;
// public class frames {
//     public static void main(String[] args) {
//         LinkedList<String> a=new LinkedList<>();
//         a.add("Shiva");
//         a.add("Kumar");
//         a.add(0,"paru");
//         a.addFirst("nayak");
//         a.addLast("mohan");
//         System.out.println(a.getFirst());
//         System.out.println(a.getLast());
//         System.out.println(a.removeFirst());
//         System.out.println(a.removeLast());
//         System.out.println(a);
//     }
// } // linkedlist in java

import java.util.*;
public class frames
{
    public static void main(String[] args)  {
        int a[]={1,1,1,2,3,5,5,5,6,6,9,9,9,9};
        HashSet<Integer> hs=new HashSet<>();
        while(!hs.isEmpty())
        {
            System.out.print("The set is empty");
        }
        for(int i=0;i<a.length;i++)
        {
            hs.add(a[i]);
        }
        System.out.println("unique elements ");
        for(int e:hs)
        {
            System.out.print(e+" ");
        }

    }
}
