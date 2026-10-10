public class t {
    static class shiva implements  Runnable
    {
        public void run()
        {
          System.out.print("This is the runnable interface available in java");
        }
    }
    // static  class shiva extends Thread
    // {
    //     public void run()
    //     {
    //         System.out.print("u are inside the thread in java");
    //         for(int i=0;i<=5;i++)
    //         {
    //             System.out.print("value of i ="+i);
    //         }
    //     }
    // }
    public static void main(String args[])
    {
        shiva a=new shiva();
        Thread t=new Thread(a);
        t.start();
        System.out.println("u are present in the main method");


        // a.start();
        // System.out.print("U are inside the main method in java");
        // System.out.println();
        // System.out.print(a.getName());
        // a.setName("SHIVA");
        // System.out.println(a.getName());
    }
}
