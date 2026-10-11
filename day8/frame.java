// import java.util.*;
// public class frame{
//     public static void main(String[] args) {
//         ArrayList<String> a=new ArrayList<>();
//         a.add("Krishna");
//         a.add("Pavan");
//         a.add("comrade");
//         ArrayList<String> b=new ArrayList<>();
//         b.add("Shiva");
//         b.add("Kumar");
//         b.add("Banoth");
//         b.add("Raju");
//         Collections.sort(a);
//         Collections.sort(b);
//         a.remove(0);
//         System.out.println(a);
//         System.out.println(b);
//         a.addAll(b);
//         System.out.println(a);
//         a.clear();
//         System.out.println(b.size());


    
//     }
    
// }


import java.util.*;
public class frame{
    static class Employee
    {
        int eid;
        String name;
        int salary;

        public Employee(int eid , int salary, String name)
        {
            this.eid=eid;
            this.salary=salary;
            this.name=name;
        }
    }
    public static void main(String[] args) {
        ArrayList<Employee> e=new ArrayList<>();
        e.add(new Employee(1,20000,"Krishna"));
        e.add(new Employee(2,30000,"Pavan"));
        e.add(new Employee(3,40000,"comrade"));
        for(Employee a:e)
        {
            System.out.println(a.eid+" "+a.name+" "+a.salary);
        }
        
    }
}