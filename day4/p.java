public class p {
static class college
{
    void vce(college obj)
    {
        System.out.print("This is Vce");
        System.out.print("Inside the this method");
    }
    void cse()
    {
        vce(this);
    }
}
    public static void main(String[] args) {
        String s="hello i am shiva";
       college a=new college();
       a.cse();
        String s1[]=s.split(" ");
        for(int i=0;i<s1.length;i++)
        {
            System.out.print(s1[i]+"");
        }

    }
}