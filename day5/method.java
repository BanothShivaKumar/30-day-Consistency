class a
{
    int i,j;
    void sum(int a,int b)
    {
        this.i=a;
        this.j=b;
        System.out.print(a+b);
    }
}
class b extends a{
    void sum(int a,int b,int c)
    {
        super.sum(a,b);
        System.out.println(a+b+c);
    }
}

public class method {
    public static void main(String[] args) {
        b obj=new b();
        obj.sum(10,20,30);
    }
}
