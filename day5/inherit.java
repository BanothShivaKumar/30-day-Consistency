// import java.lang.*;
// class animal
// {
//     void eat()
//     {
//         System.out.println("Eat");
//     }
//     void sleep()
//     {
//         System.out.println("Sleep");
//     }
// }
// class bird extends animal
// {
//     void fly()
//     {
//         System.out.println("Fly");
//     }
// }

// public class inherit
// {
//     public static void main(String[] args) {
//         bird b=new bird();
//         b.eat();
//         b.sleep();
//         b.fly();
//     }
// }///single level inheritance





// import java.lang.*;
// class animal
// {
//     void eat()
//     {
//         System.out.println("Eat");
//     }
//     void sleep()
//     {
//         System.out.println("Sleep");
//     }
// }
// class bird extends animal
// {
//     void fly()
//     {
//         System.out.println("Fly");
//     }
// }
// class parrot extends bird
// {
//     void sound()
//     {
//         System.out.println("Cheep cheep");
//     }
// }
// public class inherit
// {
//     public static void main(String[] args) {
//         parrot p=new parrot();
//         p.eat();
//         p.sleep();
//         p.fly();
//         p.sound();
//     }
//     //Mulit level inheritance  ---  in which one superclass that contains one subclass, and also that subclass contains another subclass
// }


import java.lang.*;
class animal
{
    void eat()
    {
        System.out.println("Eat");
    }
    void sleep()
    {
        System.out.println("Sleep");
    }
}
class bird extends animal
{
    void fly()
    {
        System.out.println("Fly");
    }
}
class parrot extends animal{
    void sound()
    {
        System.out.println("Cheep cheep");
    }
}

public class inherit
{
    public static void main(String[] args) {
        bird b=new bird();
        b.eat();
        b.sleep();
        b.fly();
        parrot a=new parrot();
        a.eat();
        a.sleep();
        a.sound();
    }
    //Hierarchy inheritance  --- in which one superclass contains more than one subclass
}