abstract class Bigboss
{
    abstract void winner();
    abstract void runner();
    void season()
    {
        System.out.println("The season is 1");
    }
    final void power()
    {
        System.out.print("powert");
    }
}
class starmaa extends Bigboss
{
    void power()
    {
        System.out.print("power");
    }
    void winner()
    {
        System.out.println("shiva");
    }
    void runner()
    {
        System.out.println("Kumar");
    }
}
public class abst {
    public static void main(String[] args) {
        Bigboss a=new starmaa();
        a.winner();
        a.runner();
        a.season();

        final int age =10;
        age=30;
        System.out.print("The age is :+"+ age);


    }
}
