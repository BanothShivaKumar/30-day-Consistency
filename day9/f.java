// import java.io.*;
// public class f {
//     public static void main(String[] args) {
//     try{
//         File f=new File("kumar.txt");
//         System.out.print(f.exists());
//         f.createNewFile();
//         System.out.print(f.exists());
//         System.out.print(f.getName());
//     }
//     catch(Exception e)
//     {
//         System.out.print(e);
//     }
//     }
// }
// to create an file

import java.io.*;
public class f
{
    public static void main(String[] args) {
        try
        {
            File f=new File("shivam.txt");
            f.mkdir();
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}