abstract class Bigboss
{
    abstract void winner();
    abstract void runner();
    void season()
    {
        System.out.println("The season is 1");
    }
}
class starmaa extends Bigboss
{
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
        starmaa a=new starmaa();
        a.winner();
        a.runner();
        a.season();
    }
}
