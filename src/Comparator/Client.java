package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
    public static void main(String[] args) {
//        Student s = new Student("ajay",34,98);
//        Student s1 = new Student("prem",22,78);
//        Student s2 = new Student("ajay",30,88);
//        Student s3 = new Student("harish",18,68);
//        ArrayList<Student>ls = new ArrayList<>();
//        ls.add(s);
//        ls.add(s1);
//        ls.add(s2);
//        ls.add(s3);
//        AgeComparator ag = new AgeComparator();
//        Collections.sort(ls,ag);
//        for(Student st: ls)
//        {
//            System.out.println(st.age);
//            System.out.println(st.name);
//            System.out.println(st.psp);
//            System.out.println("*****************");
//        }



        Employee s = new Employee("ajay",34,98);
        Employee s1 = new Employee("prem",22,78);
        Employee s2 = new Employee("ajay",30,88);
        Employee s3 = new Employee("harish",18,68);
        ArrayList<Employee>ls = new ArrayList<>();
        ls.add(s);
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);
        SalaryComparator ag = new SalaryComparator();
        Collections.sort(ls,ag);
        for(Employee st: ls)
        {
            System.out.println(st.age);
            System.out.println(st.name);
            System.out.println(st.salary);
            System.out.println("*****************");
        }


    }
}
