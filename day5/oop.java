public class oop
{
    public static void subarray(int num[]) {
            int minimum=1;
            int max=Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
          for(int j=i;j<num.length;j++) {
               minimum=0;
            for(int k=i;k<j;k++) {
                minimum+=num[k];
            }
            System.out.println(minimum);
             if(max<minimum){
                   max=minimum;
             }
          }
        }

        System.out.println("Max sum :"+max);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        subarray(num);
       

    }
}