package hibernate_one_to_many_bi_entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Department dep = new Department("Sales", 700, 1500);
//            Employee emp1 = new Employee("Andrei", "Cataraga",  800);
//            Employee emp2= new Employee("Victor", "Pusca",  1000);
//            Employee emp3= new Employee("Ion", "Ionita",  600);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);
//
//            session.beginTransaction();
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            System.out.println("Get Department");
//            Department department = session.get(Department.class, 5);
//            System.out.println("Show Department");
//            System.out.println(department);
//            System.out.println("Show employees of the department");
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session = factory.getCurrentSession();

            session.beginTransaction();
            System.out.println("Get Department");
            Department department = session.get(Department.class, 5);
            System.out.println("Show Department");
            System.out.println(department);
            System.out.println("Uploading our employees");
            department.getEmps().get(0);

            session.getTransaction().commit();
            System.out.println("Show employees of the department");
            System.out.println(department.getEmps());
            System.out.println("Done!");
        }
        finally {
            session.close();
            factory.close();
        }
    }
}