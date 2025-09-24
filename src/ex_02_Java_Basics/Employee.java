package ex_02_Java_Basics;

public class Employee {
    //Variables
    int eid;
    String ename;
    String job;
    int sal;

    //Methods
    void display()
    {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(job);
        System.out.println(sal);
    }
  /*public static void main(String[] args)
    {
        Employee emp1=new Employee();//Object
        emp1.eid=101;
        emp1.ename="John";
        emp1.job="Manager";
        emp1.sal=500000;
        emp1.display();

        Employee emp2=new Employee();//Object
        emp2.eid=102;
        emp2.ename="Johny";
        emp2.job="Assistant Manager";
        emp2.sal=50000;
        emp2.display();
    }*/
}
