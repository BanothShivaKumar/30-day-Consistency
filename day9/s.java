// // import java.util.*;
// // public class s {
// //     public static void main(String[] args) {
// //         TreeSet<String> a=new TreeSet<>();
// //         a.add("paru");
// //         a.add("shiva");
// //         a.add("kumar");
// //         a.add("nayak");
// //         a.add("mohan");
// //         System.out.println(a);
// //         Iterator i=a.iterator();
// //         System.out.println("Ascending order : ");
// //         while(i.hasNext())
// //         {
// //             System.out.print(i.next()+" ");
// //         }
// //     }
// // }  // basic on the treeset


// import java.util.*;
// public class s
// {
//     public static void main(String[] args) {
//         HashMap<String,Integer> a=new HashMap<>();
//         a.put("shiva",1);
//         a.put("kumar",2);
//         a.put("paru",3);
//         a.put("nayak",4);
//         a.put("mohan",5);
//         a.replace("kumar",1209);
//         System.out.println(a);
//         HashMap<String,Integer> b=new HashMap<>();
//         b.put("balu",1);
//         b.put("patela",2);
//         b.put("shree",3);
//         b.put("ram",4);
//         b.put("sita",5);
//         b.putAll(a);
//         System.out.println(b);
//         System.out.println(a.keySet());
//     }
// }//hash map in java



import java.io.*;
public class s
{
    public static void main(String[] args) {
        try
        {
            File f=new File("shiva.txt");
            System.out.print(f.exists());
            f.createNewFile();
            System.out.print(f.exists());
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
        
    }
}
