// public class except {
//     public static void main(String[] args) {
//         // This is the multiple catch
// //     try
// // 	    {
// // 		int a = 10;
// // 		System.out.println("a = " + a);
// // 		int b = 42 / a;
// // 		int c[] = { 1 };
// // 		c[42] = 99;
// // 	    } 
// // 	    catch(ArithmeticException e)
// // 	    {
// // 		System.out.println("Divide by 0: " + e);
// // 	    } 
// // 	    catch(ArrayIndexOutOfBoundsException e)
// // 	    {
// // 		System.out.println("Array index oob: " + e);
// // 	}
// // 	System.out.println("After try and catch blocks.");
// //    }
//         // try{
//         //     int a[]={1,2,0,3,4};
//         //     try
//         //     {
//         //         System.out.print(a[1]/a[2]);
//         //     }
//         //     catch(Exception e)
//         //     {
//         //         e.printStackTrace();
//         //     }
//         //     a[34]=23;
//         // }
//         // catch(ArrayIndexOutOfBoundsException e)
//         // {
//         //     System.out.print(e);
//         // }
        
//     }
// }


public class except{
    static void div() throws ArithmeticException{
        int a=10/0;
    }
    public static void main(String[] args) {
        int a[]={12,3,4};
        try
        {
            div();
            System.out.print(a[2]/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
            e.printStackTrace();
        }
        finally{
            System.out.print("so this is the final block in the code");
        }
    }
}